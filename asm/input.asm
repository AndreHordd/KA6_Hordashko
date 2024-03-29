.model small
.stack 100h
.data
buffer db 0FFh dup(?) ; буфер для вводу
numBuffer db 10000 dup(?) ; буфер для чисел
numCount dw 0 ; кількість чисел
.code
main proc
    mov ax, @data
    mov ds, ax

    ; Підготовка регістрів для функції 3Fh (читання з файлу)
    mov ah, 3Fh       ; Функція DOS для читання з файлу
    mov bx, 0         ; Handle stdin
    lea dx, buffer    ; Вказівник на буфер, куди будуть зчитуватися дані
    mov cx, 0FFh      ; Максимальна кількість байтів для зчитування
    int 21h           ; Виклик DOS-інтерапту
    ; AX тепер містить кількість байтів, що були прочитані

    ; Перевірка на кінець файлу (EOF)
    cmp ax, cx 	      ; Порівнюємо кількість прочитаних байтів з максимальною кількістю
    jae display       ; Якщо прочитано стільки ж байтів або більше
    mov cx, ax        ; Якщо прочитано менше, корегуємо CX для виведення

display:
    mov ah, 02h       ; Функція DOS для виведення символу
    mov si, 0         ; Встановлюємо SI на початок буфера

print_loop:
    mov dl, buffer[si]; Вставляємо символ для виведення
    int 21h           ; Виводимо символ
    inc si            ; Наступний символ
    loop print_loop   ; Повторюємо, поки CX не дорівнюватиме 0

    ; Завершення програми і повернення до DOS
    mov ax, 4C00h
    int 21h


main endp
end main