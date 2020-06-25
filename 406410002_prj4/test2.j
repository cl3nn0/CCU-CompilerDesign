;.source
.class public static myResult
.super java/lang/Object
.method public static main([Ljava/lang/String;)V
.limit stack 100
.limit locals 100
ldc 1.1
fstore 0
ldc 2.2
fstore 1
ldc 3
istore 3
iload 3
ldc 1
iadd
istore 3
fload 0
fload 1
fadd
fstore 0
iload 3
ldc 777
ldc 8
ldc 9
iadd
imul
iadd
istore 4
iload 4
iload 3
if_icmpgt L1
ldc 0
goto L2
L1 :
ldc 1
L2 :
ifeq L3
ldc 6.6
fstore 0
goto L4
L3 :
ldc 0.6
fstore 0
L4 :
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "a = %f\n"
ldc 1
anewarray java/lang/Object
dup
ldc 0
fload 0
invokestatic java/lang/Float.valueOf(F)Ljava/lang/Float;
aastore
invokevirtual java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
pop
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "b = %f\n"
ldc 1
anewarray java/lang/Object
dup
ldc 0
fload 1
invokestatic java/lang/Float.valueOf(F)Ljava/lang/Float;
aastore
invokevirtual java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
pop
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "c = %d\n"
ldc 1
anewarray java/lang/Object
dup
ldc 0
iload 3
invokestatic java/lang/Integer.valueOf(I)Ljava/lang/Integer;
aastore
invokevirtual java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
pop
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "d = %d\n"
ldc 1
anewarray java/lang/Object
dup
ldc 0
iload 4
invokestatic java/lang/Integer.valueOf(I)Ljava/lang/Integer;
aastore
invokevirtual java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
pop
return
.end method
