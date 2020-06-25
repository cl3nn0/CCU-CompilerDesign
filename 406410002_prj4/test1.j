;.source
.class public static myResult
.super java/lang/Object
.method public static main([Ljava/lang/String;)V
.limit stack 100
.limit locals 100
ldc 100
istore 0
ldc 0
istore 1
L1 :
iload 1
ldc 5
if_icmplt L5
ldc 0
goto L6
L5 :
ldc 1
L6 :
ifeq L4
goto L2
L3 :
iload 1
ldc 1
iadd
istore 1
goto L1
L2 :
iload 0
ldc 1
iadd
istore 0
goto L3
L4 :
iload 0
lookupswitch
	100	:	L8
	101	:	L9
	105	:	L10
	default	:	L11
L8 :
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "a = 100\n"
ldc 0
anewarray java/lang/Object
invokevirtual java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
pop
goto L7
L9 :
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "a = 101\n"
ldc 0
anewarray java/lang/Object
invokevirtual java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
pop
goto L7
L10 :
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "a = 105\n"
ldc 0
anewarray java/lang/Object
invokevirtual java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
pop
goto L7
L11 :
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "nonono\n"
ldc 0
anewarray java/lang/Object
invokevirtual java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
pop
goto L7
L7 :
return
.end method
