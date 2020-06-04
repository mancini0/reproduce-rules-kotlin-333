load("@io_bazel_rules_kotlin//kotlin:kotlin.bzl", "kt_jvm_binary", "kt_jvm_library", "kt_jvm_test")


kt_jvm_library(
    name = "some-lib",
    srcs = [
        "src/main/kotlin/SomeLib.kt",
    ],
    resources = [],
    deps = [],
)

kt_jvm_binary(
    name = "app",
    srcs = [
        "src/main/kotlin/App.kt",
    ],
    main_class = "com.example.AppKt",
    resources = [],
    deps = [":some-lib"],
)