# Copyright (C) 2016 FEDEVEL
# Based on u-boot-fslc.inc Copyright (C) 2012-2015 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)
 
require recipes-bsp/u-boot/u-boot.inc
inherit fsl-u-boot-localversion

SUMMARY = "U-Boot bootloader with support for OpenRex board"
DESCRIPTION = "U-Boot bootloader with support for OpenRex board. More info at http://www.imx6rex.com/open-rex"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=0507cd7da8e7ad6d6701926ec9b84c95"

COMPATIBLE_MACHINE = "(mxs|mx5|mx6|mx6ul|mx7|vf|imx6q-openrex|imx6s-openrex)"

DEPENDS_mxs += "elftosb-native openssl-native"

PROVIDES += "u-boot"

SRCBRANCH ??= "jethro"

SRC_URI = "git://github.com/youcomp/openrex-uboot-v2015.10.git;branch=${SRCBRANCH}"

#SRCREV is the commit number, must be always changed for a new version
SRCREV = "3619a27d63caace8d9f4ba270158e77ae1075b6b"

S = "${WORKDIR}/git"

# FIXME: Allow linking of 'tools' binaries with native libraries
#        used for generating the boot logo and other tools used
#        during the build process.
EXTRA_OEMAKE += 'HOSTCC="${BUILD_CC} ${BUILD_CPPFLAGS}" \
                 HOSTLDFLAGS="${BUILD_LDFLAGS}" \
                 HOSTSTRIP=true'

PACKAGE_ARCH = "${MACHINE_ARCH}"

PV = "v2015.10+git${SRCPV}"


