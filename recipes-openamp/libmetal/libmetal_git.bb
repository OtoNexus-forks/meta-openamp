SRCBRANCH ?= "master-rel-2021.1"
SRCREV = "1ea0b872057a3f6636712dfda36bc6f1420f99af"
BRANCH = "master-rel-2021.1"
LIC_FILES_CHKSUM ?= "file://LICENSE.md;md5=1ff609e96fc79b87da48a837cbe5db33"
PV = "${SRCBRANCH}+git${SRCPV}"

include libmetal.inc
