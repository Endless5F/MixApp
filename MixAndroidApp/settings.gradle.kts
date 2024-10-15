pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        maven(uri("https://maven.aliyun.com/nexus/content/groups/public/"))
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven(uri("https://maven.aliyun.com/nexus/content/groups/public/"))
        google()
        mavenCentral()
        gradlePluginPortal()
        maven {
            url = uri("https://storage.googleapis.com/download.flutter.io")
        }
        maven {
            // 此uri可更换成私有的maven仓库，需要将单独开发完的flutter aar打包上传到此maven仓库，用于aar依赖
            // 若此处为loacl本地依赖，则更换目录的相对路径即可
            // url = uri("some/path/flutter_module/build/host/outputs/repo")
        }

    }
}

rootProject.name = "MixAndroidApp"
include(":app")
 
