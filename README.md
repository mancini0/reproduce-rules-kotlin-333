
example code reproducing [rules_kotlin issue #333](https://github.com/bazelbuild/rules_kotlin/issues/333)

<code>
bazel run //example:app
</code>
<br/>
you will encounter the following runtime exception:
<br/>
<br/>
<code>
INFO: Build completed successfully, 1 total action
Exception in thread "main" java.lang.NoClassDefFoundError: kotlin/jdk7/AutoCloseableKt
	at com.example.SomeLib.doFoo(SomeLib.kt:16)
	at com.example.AppKt.main(App.kt:6)
	at com.example.AppKt.main(App.kt)
Caused by: java.lang.ClassNotFoundException: kotlin.jdk7.AutoCloseableKt
	at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:581)
	at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:178)
	at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:522)
</code>

