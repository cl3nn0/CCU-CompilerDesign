;.source
.class public static myResult
.super java/lang/Object
.method public static main([Ljava/lang/String;)V
.limit stack 100
.limit locals 100
ldc 10
istore 0
ldc 5
istore 1
L1 :
iload 0
ldc 5
if_icmpgt L3
ldc 0
goto L4
L3 :
ldc 1
L4 :
ifeq L5
ldc 1
goto L6
L5 :
ldc 0
L6 :
iload 1
iload 0
if_icmplt L7
ldc 0
goto L8
L7 :
ldc 1
L8 :
ifeq L9
ldc 1
goto L10
L9 :
ldc 0
L10 :
iand
ifeq L2
iload 0
ldc 1
isub
istore 0
ldc 11
iload 0
isub
istore 1
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "in while loop , a = %d , b = %d\n"
ldc 2
anewarray java/lang/Object
dup
ldc 0
iload 0
invokestatic java/lang/Integer.valueOf(I)Ljava/lang/Integer;
aastore
dup
ldc 1
iload 1
invokestatic java/lang/Integer.valueOf(I)Ljava/lang/Integer;
aastore
invokevirtual java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
pop
goto L1
L2 :
ldc 9
istore 0
L11 :
iload 1
ldc 1
if_icmpge L15
ldc 0
goto L16
L15 :
ldc 1
L16 :
ifeq L17
ldc 1
goto L18
L17 :
ldc 0
L18 :
iload 0
ldc 0
if_icmple L19
ldc 0
goto L20
L19 :
ldc 1
L20 :
ifeq L21
ldc 1
goto L22
L21 :
ldc 0
L22 :
ior
ifeq L14
goto L12
L13 :
iload 0
ldc 1
iadd
istore 0
goto L11
L12 :
iload 0
ldc 87
isub
istore 1
goto L13
L14 :
iload 1
ldc 3
if_icmplt L23
ldc 0
goto L24
L23 :
ldc 1
L24 :
ifeq L25
ldc 333
istore 1
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "i am if-then statement !!!\n"
ldc 0
anewarray java/lang/Object
invokevirtual java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
pop
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "after for loop and if-then statement , a = %d , b = %d\n"
ldc 2
anewarray java/lang/Object
dup
ldc 0
iload 0
invokestatic java/lang/Integer.valueOf(I)Ljava/lang/Integer;
aastore
dup
ldc 1
iload 1
invokestatic java/lang/Integer.valueOf(I)Ljava/lang/Integer;
aastore
invokevirtual java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
pop
goto L26
L25 :
L26 :
ldc 0
return
return
.end method
