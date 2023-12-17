<p align="center">
    <a href="https://www.curseforge.com/minecraft/mc-mods/ex-nihilo-sequentia-mekanism-addon"><img src="https://cf.way2muchnoise.eu/full_430787_downloads.svg" /></a>
    <a href="https://www.curseforge.com/minecraft/mc-mods/ex-nihilo-sequentia-mekanism-addon"><img src="https://cf.way2muchnoise.eu/versions/430787.svg" /></a>
    <a href="https://github.com/NovaMachina-Mods/ExNihiloMekanism/blob/1.19/LICENSE"><img alt="GitHub license" src="https://img.shields.io/badge/license-CC%20BY--NC--SA%204.0-brightgreen"></a>
    <a href="https://github.com/NovaMachina-Mods/ExNihiloMekanism/issues"><img alt="GitHub issues" src="https://img.shields.io/github/issues/NovaMachina-Mods/ExNihiloMekanism"></a>
    <a href="https://github.com/NovaMachina-Mods/ExNihiloMekanism/stargazers"><img alt="GitHub stars" src="https://img.shields.io/github/stars/NovaMachina-Mods/ExNihiloMekanism"></a>
</p>

# Ex Nihilo: Sequentia - Mekanism Addon for Minecraft 1.19

Addon for Ex Nihilo: Sequentia to add support for Mekanism

# Discord

Ex Nihilo: Sequentia - Mekanism Addon is on the NovaMachina Mods [discord server](https://discord.gg/CJyAkuw) where you can chat with other Ex Nihilo: Sequentia users and the developers.

# Translating

If you would like to help translate Ex Nihilo: Sequentia, please create a pull request with your translation.

# License

[![](https://i.creativecommons.org/l/by-nc-sa/4.0/88x31.png)](http://creativecommons.org/licenses/by-nc-sa/4.0/)

The source code of this work is licensed under a [Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International License](http://creativecommons.org/licenses/by-nc-sa/4.0/).

Artwork of this mod is licensed under an All rights reserved license: Copyright &copy;2023 NovaMachina-Mods All rights reserved.

# Maven

Ex Nihilo: Sequentia - Mekanism Addon is avaliable via the [NovaMachina Mods artifact repository](https://cloudsmith.io/~novamachina-mods/repos/ex-nihilo-sequentia/packages/) for developers wishing to utilize its API.

Add the following to your `build.gradle`:

```groovy
repositories {
    maven {
        url = "https://dl.cloudsmith.io/public/novamachina-mods/ex-nihilo-sequentia/maven/"

    }
}

dependencies {
    implementation(fg.deobf("novamachina.exnihilomekanism:ExNihiloMekanism:${exnihilo_version}"))
}
```

Add the following to your `gradle.properties` (see [Maven](https://cloudsmith.io/~novamachina-mods/repos/ex-nihilo-sequentia/packages/) for the list of available versions):

```properties
exnihilo_version: 1.19.2-4.1.0.55-beta
```

[![Hosted By: Cloudsmith](https://img.shields.io/badge/OSS%20hosting%20by-cloudsmith-blue?logo=cloudsmith&style=for-the-badge)](https://cloudsmith.com)

Package repository hosting is graciously provided by  [Cloudsmith](https://cloudsmith.com).
Cloudsmith is the only fully hosted, cloud-native, universal package management solution, that
enables your organization to create, store and share packages in any format, to any place, with total
confidence.
