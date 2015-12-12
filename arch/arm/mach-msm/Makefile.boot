# MSM8974
   zreladdr-$(CONFIG_ARCH_MSM8974)	:= 0x00008000

# APQ8084
   zreladdr-$(CONFIG_ARCH_APQ8084)	:= 0x00008000

# MDM9630
   zreladdr-$(CONFIG_ARCH_MDM9630)	:= 0x00008000

# MSMZIRC
   zreladdr-$(CONFIG_ARCH_MSMZIRC)	:= 0x80008000

# MSM8226
   zreladdr-$(CONFIG_ARCH_MSM8226)	:= 0x00008000
   ifeq ($(CONFIG_XIAOMI_ARMANI_DTB),y)
	dtb-$(CONFIG_ARCH_MSM8226)	+= msm8226-h2a.dtb
   else
	dtb-$(CONFIG_ARCH_MSM8226)	+= msm8226-sim.dtb
	dtb-$(CONFIG_ARCH_MSM8226)	+= msm8226-fluid.dtb
	dtb-$(CONFIG_ARCH_MSM8226)	+= msm8226-v1-cdp.dtb
	dtb-$(CONFIG_ARCH_MSM8226)	+= msm8226-v1-mtp.dtb
	dtb-$(CONFIG_ARCH_MSM8226)	+= msm8226-v1-qrd-evt.dtb
	dtb-$(CONFIG_ARCH_MSM8226)	+= msm8226-v1-qrd-dvt.dtb
	dtb-$(CONFIG_ARCH_MSM8226)	+= msm8226-v2-720p-cdp.dtb
	dtb-$(CONFIG_ARCH_MSM8226)	+= msm8226-v2-1080p-cdp.dtb
	dtb-$(CONFIG_ARCH_MSM8226)	+= msm8226-v2-720p-mtp.dtb
	dtb-$(CONFIG_ARCH_MSM8226)	+= msm8226-v2-1080p-mtp.dtb
	dtb-$(CONFIG_ARCH_MSM8226)	+= msm8226-v2-qrd-evt.dtb
	dtb-$(CONFIG_ARCH_MSM8226)	+= msm8226-v2-qrd-dvt.dtb
	dtb-$(CONFIG_ARCH_MSM8226)	+= msm8926-v1-720p-cdp.dtb
	dtb-$(CONFIG_ARCH_MSM8226)	+= msm8926-v1-1080p-cdp.dtb
	dtb-$(CONFIG_ARCH_MSM8226)	+= msm8926-v1-720p-mtp.dtb
	dtb-$(CONFIG_ARCH_MSM8226)	+= msm8926-v1-1080p-mtp.dtb
	dtb-$(CONFIG_ARCH_MSM8226)	+= msm8926-v1-qrd.dtb
	dtb-$(CONFIG_ARCH_MSM8226)	+= msm8926-v1-qrd-skug.dtb
	dtb-$(CONFIG_ARCH_MSM8226)	+= msm8926-v1-qrd-skug-pvt.dtb
	dtb-$(CONFIG_ARCH_MSM8226)	+= msm8926-v2-720p-cdp.dtb
	dtb-$(CONFIG_ARCH_MSM8226)	+= msm8926-v2-1080p-cdp.dtb
	dtb-$(CONFIG_ARCH_MSM8226)	+= msm8926-v2-1080p-ext-buck-cdp.dtb
	dtb-$(CONFIG_ARCH_MSM8226)	+= msm8926-v2-720p-mtp.dtb
	dtb-$(CONFIG_ARCH_MSM8226)	+= msm8926-v2-1080p-mtp.dtb
	dtb-$(CONFIG_ARCH_MSM8226)	+= msm8926-v2-1080p-ext-buck-mtp.dtb
	dtb-$(CONFIG_ARCH_MSM8226)	+= msm8926-v2-qrd.dtb
	dtb-$(CONFIG_ARCH_MSM8226)	+= msm8926-v2-qrd-skug.dtb
	dtb-$(CONFIG_ARCH_MSM8226)	+= msm8926-v2-qrd-skug-pvt.dtb
	dtb-$(CONFIG_ARCH_MSM8226)	+= msm8226-v1-qrd-skuf.dtb
	dtb-$(CONFIG_ARCH_MSM8226)	+= msm8226-v2-qrd-skuf.dtb
	dtb-$(CONFIG_ARCH_MSM8226)	+= apq8026-v1-xpm.dtb
	dtb-$(CONFIG_ARCH_MSM8226)	+= apq8026-v1-cdp.dtb
	dtb-$(CONFIG_ARCH_MSM8226)	+= apq8026-v1-mtp.dtb
	dtb-$(CONFIG_ARCH_MSM8226)	+= apq8026-v2-xpm.dtb
	dtb-$(CONFIG_ARCH_MSM8226)	+= apq8026-v2-720p-cdp.dtb
	dtb-$(CONFIG_ARCH_MSM8226)	+= apq8026-v2-1080p-cdp.dtb
	dtb-$(CONFIG_ARCH_MSM8226)	+= apq8026-v2-720p-mtp.dtb
	dtb-$(CONFIG_ARCH_MSM8226)	+= apq8026-v2-1080p-mtp.dtb
   endif

# FSM9900
   zreladdr-$(CONFIG_ARCH_FSM9900)	:= 0x0b608000

# MSMFERRUM
   zreladdr-$(CONFIG_ARCH_MSMFERRUM)	:= 0x80008000

# MSM8610
   zreladdr-$(CONFIG_ARCH_MSM8610)	:= 0x00008000

