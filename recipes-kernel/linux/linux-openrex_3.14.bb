# Copyright (C) 2016 FEDEVEL
# Released under the MIT license (see COPYING.MIT for the terms)
 
SUMMARY = "Linux Kernel for OpenRex board"
DESCRIPTION = "Linux Kernel for OpenRex board. More info \
at http://www.imx6rex.com/open-rex"

require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

DEPENDS += "lzop-native bc-native"

SRC_URI = "git://github.com/youcomp/openrex-linux-3.14.git;branch=${SRCBRANCH} \
           file://defconfig"
LOCALVERSION = "-fslc"

#PV .= "+git${SRCPV}"

SRCBRANCH = "jethro"
SRCREV = "e75f1f8deaaa63f3d2dc1a05b37e7f19b559166e"

COMPATIBLE_MACHINE = "(mx6|mx7|imx6q-openrex|imx6s-openrex)"
