rootProject.name = "ArkBlock-Build"

include(
    "apiserver",
    "arkmanager",
    "blockdata",
    "blockgenerator",
    "blockintellisense",
    "blockoptimizer",
    "blockpreprocessor",
    "codegenerator"
)

project(":apiserver").name = "apiserver"
project(":arkmanager").name = "arkmanager"
project(":blockdata").name = "blockdata"
project(":blockgenerator").name = "blockgenerator"
project(":blockintellisense").name = "blockintellisense"
project(":blockoptimizer").name = "blockoptimizer"
project(":blockpreprocessor").name = "blockpreprocessor"
project(":codegenerator").name = "codegenerator"
