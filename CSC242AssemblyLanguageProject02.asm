; A program that prompts the user for four values that are going to be passed to a value-returning 
; procedure called min4 to find the smaller of four double-word integer parameters. The smallest integer is the result output.
; The main program contains a loop function and a way to exit the loop. 
; The Min4 procedure is written after the main program and is called in the main program. 
; Author: Francisco Guzman 
; Date: 11/29/2019 


.586
.MODEL FLAT

INCLUDE io.h

.STACK 4096 

.DATA
number1 DWORD ?
number2 DWORD ?
number3 DWORD ?
number4 DWORD ?

; Prompts the user to enter in four values of type integer 
prompt1 BYTE "Enter the first number.", 0
prompt2 BYTE "Enter the second number.", 0
prompt3 BYTE "Enter the third number.", 0
prompt4 BYTE "Enter the fourth number.", 0
string BYTE 40 DUP(? )
resultLbl BYTE "The Smallest Integer is:", 0
result BYTE 11 DUP(? ), 0

; Moves the four parameters onto the EAX register and stores them in memory and then removes them from the stack afterwards and restores it.
.CODE
_MainProc PROC                           
       input prompt1, string, 40; read ASCII characters
       atod string; convert to integer
       mov number1, eax; store in memory

       input prompt2, string, 40; repeat for second number
       atod string
       mov number2, eax

       input prompt3, string, 40; repeat for third number
       atod string
       mov number3, eax

       input prompt4, string, 40; repeat for fourth number
       atod string
       mov number4, eax

       push number4; stores fourth paramater
       push number3; stores third parameter
       push number2; stores second parameter
       push number1; stores first parameter
       call Min4; calls the Min4 procedure into the main program 
       add    esp, 12; removes parameters from stack

       dtoa   result, eax; convert to ASCII characters
       output resultLbl, result; output label and result

	   ;add   esp, 128; restores the stack but terminates the loop with an exception thrown 
	   ;add   esp, 12;  keeps the main program in continous loop 

	   mov    eax, 0;   exit with return code 0  
       ret; return 

_MainProc ENDP

; Procedure called Min4 to return the smallest integer of the four values entered. 

Min4 PROC

      push ebp; save base pointer
      mov ebp, esp; establish stack frame
      push ebx; save EBX
      push ecx; save ECX
      push edx; save EDX
      push esi; save EEX

      mov ebx, [ebp + 8]; load integer 1 in EBX
      mov ecx, [ebp + 12]; load integer 2 in ECX
      mov edx, [ebp + 16]; load integer 3 in EDX
      mov esi, [ebp + 20]; load integer 4 in ESI

  ; The code below compares the values entered together in the registers they are located and includes jump instructions for looping.

FirstSecond:
     cmp ebx, ecx; compare EBX with ECX
     jle FirstThird; jump if EBX is less or equal than 0
     jmp SecondThird; jump if EBX is greater than 0

FirstThird:
     cmp ebx, edx; compare EBX with EDX
     jle FirstFourth; jump if EBX is less or equal than 0
     jmp ThirdFourth; jump if EBX is geater than 0

FirstFourth:
     cmp ebx, esi; compare EBX with ESI
     jle Value1; jump if EBX is less then 0
     jmp Value2; jump if ESI is greater then 0

ThirdFourth:
     cmp edx, esi; compare ESI with EDX
     jle Value3; jump if EDX is less then 0
     jle Value2; jump if ESI is greater then 0

SecondThird:
     cmp ecx, edx; compare ECX with EDX
     jle SecondFourth; jump if ECX is less or equal than 0
     jmp ThirdFourth; jump if ECX is geater than 0

SecondFourth:
     cmp ecx, esi; compare ECX with EEX
     jle Value4; jump if ECX is less then 0 
     jmp Value2; jump if ESI is greater then 0

; These four values below each includes their respective registers and are each moved to the EAX accumalator sequentially. 
; Value1: EBX register, Value2: ESI register, Value3: EDX register, Value4: ECX register

Value1:
     mov eax, ebx; moves EBX to EAX
     jmp exitCode; exit if there are no elements

Value2:
     mov eax, esi; moves ESI to EAX
     jmp exitCode

Value3:
     mov eax, edx; moves EDX to EAX
     jmp exitCode

Value4:
     mov eax, ecx; move ECX to EAX
     jmp exitCode

	 ; This exits the comparing instructions and moves to pop the respective registers off of the stack frame and restores them. 
	 ; The Min4 procedure is then executed after being called in the main program and then is terminated when the user enters the four values. 

exitCode:
     pop esi; retore registers
     pop edx; restores EDX
     pop ecx; restores ECX
     pop ebx; restores EBX
     pop ebp; restores EBP
     ret; return
Min4 ENDP
END