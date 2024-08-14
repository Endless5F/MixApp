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
    }
}

rootProject.name = "MixAndroidApp"
include(":app")
 