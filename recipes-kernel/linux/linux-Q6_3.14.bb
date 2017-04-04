# Copyright (C) 2015, 2016 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "i.MX6 Linux kernel for JCI Q6 Board"
DESCRIPTION = "Linux kernel based on Freescale 3.14.52-1.1.0 GA release, used by FSL Community BSP in order to \
provide support for i.MX6 based platforms and include official Linux kernel stable updates, backported \
features and fixes coming from the vendors, kernel community or FSL Community itself."

# Note: inserted linux-fslc.inc directly in file here

require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

DEPENDS += "lzop-native bc-native"

SRCBRANCH = "jethro"
LOCALVERSION = "-yocto"

#SRCREV is the commit number, must be always changed for a new version
SRCREV = "5ad48e69439a3d5e2c114d64557c109a7eb4fd01"

SRC_URI = "git://github.com/itgembedded/Q6-linux-3.14.git;branch=${SRCBRANCH} \
           file://defconfig"

# PV .= "+git${SRCPV}"
PV .= ""

COMPATIBLE_MACHINE = "(mx6|mx7|imx6q-Q6)"
