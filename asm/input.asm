.model small
.stack 100h

.data
    numbers db 6 dup(0)

.code
main PROC
    mov ax, @data
    mov ds, ax

    mov cx, 6
    lea si, numbers
read_loop:
    call read_number
    mov [si], al
    inc si
    loop read_loop

    mov cx, 6
    lea si, numbers
print_loop:
    mov dl, [si]
    add dl, '0'
    mov ah, 02h
    int 21h
    inc si
    loop print_loop
    jmp program_end

read_number:
    xor ax, ax
    mov ah, 01h
    int 21h
    sub al, '0'
    ret

program_end:
    mov ax, 4c00h
    int 21h

main ENDP
END main
