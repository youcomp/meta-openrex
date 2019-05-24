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
SRCREV = "9773f86977a6a3de4a2aeaf3e1c121257f6ae5f9"

COMPATIBLE_MACHINE = "(mx6|mx7|imx6q-openrex)"
