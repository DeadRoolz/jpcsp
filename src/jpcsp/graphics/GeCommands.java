/*
This file is part of jpcsp.

Jpcsp is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

Jpcsp is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with Jpcsp.  If not, see <http://www.gnu.org/licenses/>.
 */
package jpcsp.graphics;

public class GeCommands {

    private final String[] commands;

    public final static int NOP = 0x00; //	No Operation
    public final static int VADDR = 0x01; // 	Vertex List (BASE)
    public final static int IADDR = 0x02; 	//	Index List (BASE)
    public final static int PRIM = 0x04; //Primitive Kick
        public final static int PRIM_POINT = 0x00;
        public final static int PRIM_LINE = 0x01;
        public final static int PRIM_LINES_STRIPS = 0x02;
        public final static int PRIM_TRIANGLE = 0x03;
        public final static int PRIM_TRIANGLE_STRIPS = 0x04;
        public final static int PRIM_TRIANGLE_FANS = 0x05;
        public final static int PRIM_SPRITES = 0x06;
    public final static int BEZIER = 0x05; //Bezier Patch Kick
    public final static int SPLINE = 0x06; //Spline Surface Kick
        public final static int SPLINE_EDGE_CLOSE_CLOSE = 0x0; //V OR U IS THE SAME
        public final static int SPLINE_EDGE_OPEN_CLOSE = 0x1; //V OR U IS THE SAME
        public final static int SPLINE_EDGE_CLOSE_OPEN = 0x2; //V OR U IS THE SAME
        public final static int SPLINE_EDGE_OPEN_OPEN = 0x3; //V OR U IS THE SAME
    public final static int BBOX = 0x07; //Bounding Box
    public final static int JUMP = 0x08; //Jump To New Address (BASE)
    public final static int BJUMP = 0x09; //Conditional Jump (BASE)
    public final static int CALL = 0x0A; //Call Address (BASE)
    public final static int RET = 0x0B; //Return From Call
    public final static int END = 0x0C; //Stop Execution
    public final static int UNKNOWNCOMMAND_0x0D = 0x0D;
    public final static int SIGNAL = 0x0E; //	SIGNAL 	Raise Signal Interrupt
    public final static int FINISH = 0x0F;// 	FINISH 	Complete Rendering
    public final static int BASE = 0x10; 	//BASE 	Base Address Register
    public final static int UNKNOWNCOMMAND_0x11 = 0x11;
    public final static int VTYPE = 0x12;// 	VTYPE 	Vertex Type
        public final static int VTYPE_TRANSFORM_PIPELINE_TRANS_COORD = 0x0;
        public final static int VTYPE_TRANSFORM_PIPELINE_RAW_COORD = 0x1;

        public final static int VTYPE_INDEX_NOT_USING_INDEX = 0x00;
        public final static int VTYPE_INDEX_8_BIT = 0x01;
        public final static int VTYPE_INDEX_16_BIT = 0x02;
        public final static int VTYPE_INDEX_UNKNOW = 0x03;

        public final static int VTYPE_WEIGTH_FORMAT_NOT_PRESENT = 0x00;
        public final static int VTYPE_WEIGTH_FORMAT_8_BIT = 0x01;
        public final static int VTYPE_WEIGTH_FORMAT_16_BIT = 0x02;
        public final static int VTYPE_WEIGTH_FORMAT_32_BIT = 0x03;

        public final static int VTYPE_POSITION_FORMAT_NOT_PRESENT = 0x00;
        public final static int VTYPE_POSITION_FORMAT_8_BIT = 0x01;
        public final static int VTYPE_POSITION_FORMAT_16_BIT = 0x02;
        public final static int VTYPE_POSITION_FORMAT_36_BIT = 0x03;

        public final static int VTYPE_NORMAL_FORMAT_NOT_PRESENT = 0x00;
        public final static int VTYPE_NORMAL_FORMAT_8_BIT = 0x01;
        public final static int VTYPE_NORMAL_FORMAT_16_BIT = 0x02;
        public final static int VTYPE_NORMAL_FORMAT_32_BIT = 0x03;

        public final static int VTYPE_COLOR_FORMAT_NOT_PRESENT = 0x00;
        public final static int VTYPE_COLOR_FORMAT_UNK_0X01 = 0x01;
        public final static int VTYPE_COLOR_FORMAT_UNK_0X02 = 0X02;
        public final static int VTYPE_COLOR_FORMAT_UNK_0X03 = 0X03;
        public final static int VTYPE_COLOR_FORMAT_16BIT_BGR_5650 = 0X04;
        public final static int VTYPE_COLOR_FORMAT_16BIT_ABGR_5551 = 0X05;
        public final static int VTYPE_COLOR_FORMAT_16BIT_ABGR_4444 = 0X06;
        public final static int VTYPE_COLOR_FORMAT_32BIT_ABGR_8888 = 0X07;

        public final static int VTYPE_TEXTURE_FORMAT_NOT_PRESENT = 0X00;
        public final static int VTYPE_TEXTURE_FORMAT_8_BIT = 0X01;
        public final static int VTYPE_TEXTURE_FORMAT_16_BIT = 0X02;
        public final static int VTYPE_TEXTURE_FORMAT_32_BIT = 0X03;
    public final static int OFFSET_ADDR = 0x13; //??? 	Offset Address (BASE)
    public final static int ORIGIN_ADDR = 0x14; //??? 	Origin Address (BASE)
    public final static int REGION1 = 0x15;// 	REGION1 	Draw Region Start
    public final static int REGION2 = 0x16;// 	REGION2 	Draw Region End
    public final static int LTE = 0x17;// 	LTE 	Lighting Enable
    public final static int LTE0 = 0x18;// 	LTE0 	Light 0 Enable
    public final static int LTE1 = 0x19;// 	LTE1 	Light 1 Enable
    public final static int LTE2 = 0x1A;// 	LTE2 	Light 2 Enable
    public final static int LTE3 = 0x1B;// 	LTE3 	Light 3 Enable
    public final static int CPE = 0x1C;// 	CPE 	Clip Plane Enable
    public final static int BCE = 0x1D;// 	BCE 	Backface Culling Enable
    public final static int TME = 0x1E;// 	TME 	Texture Mapping Enable
    public final static int FGE = 0x1F;// 	FGE 	Fog Enable
    public final static int DTE = 0x20;// 	DTE 	Dither Enable
    public final static int ABE = 0x21;// 	ABE 	Alpha Blend Enable
    public final static int ATE = 0x22;// 	ATE 	Alpha Test Enable
    public final static int ZTE = 0x23;// 	ZTE 	Depth Test Enable
    public final static int STE = 0x24;// 	STE 	Stencil Test Enable
    public final static int AAE = 0x25;// 	AAE 	Anitaliasing Enable
    public final static int PCE = 0x26;// 	PCE 	Patch Cull Enable
    public final static int CTE = 0x27;// 	CTE 	Color Test Enable
    public final static int LOE = 0x28;// 	LOE 	Logical Operation Enable
    public final static int UNKNOWNCOMMAND_0x29 = 0x29;
    public final static int BOFS = 0x2A;// 	BOFS 	Bone Matrix Offset
    public final static int BONE = 0x2B;// 	BONE 	Bone Matrix Upload
    public final static int MW0 = 0x2C;// 	MW0 	Morph Weight 0
    public final static int MW1 = 0x2D;// 	MW1 	Morph Weight 1
    public final static int MW2 = 0x2E;// 	MW2 	Morph Weight 2
    public final static int MW3 = 0x2F;// 	MW3 	Morph Weight 3
    public final static int MW4 = 0x30;// 	MW4 	Morph Weight 4
    public final static int MW5 = 0x31;// 	MW5 	Morph Weight 5
    public final static int MW6 = 0x32;// 	MW6 	Morph Weight 6
    public final static int MW7 = 0x33;// 	MW7 	Morph Weight 7
    public final static int UNKNOWNCOMMAND_0x34 = 0x34;
    public final static int UNKNOWNCOMMAND_0x35 = 0x35;
    public final static int PSUB = 0x36;// 	PSUB 	Patch Subdivision
    public final static int PPRIM = 0x37;// 	PPRIM 	Patch Primitive
    public final static int PFACE = 0x38;// 	PFACE 	Patch Front Face
    public final static int UNKNOWNCOMMAND_0x39 = 0x39;
    public final static int MMS = 0x3A;// 	MDL 	Model Matrix Select
    public final static int MODEL = 0x3B;// MODEL 	Model Matrix Upload
    public final static int VMS = 0x3C;// 	VMS 	View Matrix Select
    public final static int VIEW = 0x3D;// 	VIEW 	View Matrix upload
    public final static int PMS = 0x3E;// 	PMS 	Projection matrix Select
    public final static int PROJ = 0x3F;// 	PROJ 	Projection Matrix upload
    public final static int TMS = 0x40;// 	TMS 	Texture Matrix Select
    public final static int TMATRIX = 0x41;// 	TMATRIX 	Texture Matrix Upload
    public final static int XSCALE = 0x42;// 	XSCALE 	Viewport Width Scale
    public final static int YSCALE = 0x43;// 	YSCALE 	Viewport Height Scale
    public final static int ZSCALE = 0x44;// 	ZSCALE 	Depth Scale
    public final static int XPOS = 0x45;// 	XPOS 	Viewport X Position
    public final static int YPOS = 0x46;// 	YPOS 	Viewport Y Position
    public final static int ZPOS = 0x47;// 	ZPOS 	Depth Position
    public final static int USCALE = 0x48;// 	USCALE 	Texture Scale U
    public final static int VSCALE = 0x49;// 	VSCALE 	Texture Scale V
    public final static int UOFFSET = 0x4A;// 	UOFFSET 	Texture Offset U
    public final static int VOFFSET = 0x4B;// 	VOFFSET 	Texture Offset V
    public final static int OFFSETX = 0x4C;// 	OFFSETX 	Viewport offset (X)
    public final static int OFFSETY = 0x4D;// 	OFFSETY 	Viewport offset (Y)
    public final static int UNKNOWNCOMMAND_0x4E = 0x4E;
    public final static int UNKNOWNCOMMAND_0x4F = 0X4F;
    public final static int SHADE = 0x50;// 	SHADE 	Shade Model
        public final static int SHADE_TYPE_FLAT = 0X00;
        public final static int SHADE_TYPE_SMOOTH = 0X01;
    public final static int RNORM = 0x51;// 	RNORM 	Reverse Face Normals Enable
    public final static int UNKNOWNCOMMAND_0x52 = 0X52;
    public final static int CMAT = 0x53;// 	CMAT 	Color Material
        public final static int CMAT_FLAG_AMBIENT = 0X01;
        public final static int CMAT_FLAG_DIFFUSE = 0X02;
        public final static int CMAT_FLAG_SPECULAR = 0X04;
    public final static int EMC = 0x54;// 	EMC 	Emissive Model Color
    public final static int AMC = 0x55;// 	AMC 	Ambient Model Color
    public final static int DMC = 0x56;// 	DMC 	Diffuse Model Color
    public final static int SMC = 0x57;// 	SMC 	Specular Model Color
    public final static int AMA = 0x58;// 	AMA 	Ambient Model Alpha
    public final static int UNKNOWNCOMMAND_0x59 = 0X59;
    public final static int UNKNOWNCOMMAND_0x5A = 0X5A;
    public final static int SPOW = 0x5B;// 	SPOW 	Specular Power
    public final static int ALC = 0x5C;// 	ALC 	Ambient Light Color
    public final static int ALA = 0x5D;// 	ALA 	Ambient Light Alpha
    public final static int LMODE = 0x5E;// 	LMODE 	Light Model
        public final static int LMODE_SINGLE_COLOR = 0X0;
        public final static int LMODE_SEPARETE_SPECULAR_COLOR = 0X1;
    public final static int LT0 = 0x5F;// 	LT0 	Light Type 0
    public final static int LT1 = 0x60;// 	LT1 	Light Type 1
    public final static int LT2 = 0x61;// 	LT2 	Light Type 2
    public final static int LT3 = 0x62;// 	LT3 	Light Type 3
    //SERVES FOR ALL KINDS OF LTX
        public final static int LIGHT_DIRECTIONAL = 0x00;
        public final static int LIGHT_POINT = 0x01;
        public final static int LIGHT_SPOT = 0x02;
        //LIGHT COMPONENT
        public final static int LIGHT_AMBIENT_DIFFUSE = 0X00;
        public final static int LIGHT_DIFFUSE_SPECULAR = 0X01;
        public final static int LIGHT_UNKNOW1 = 0X02;
        public final static int LIGHT_UNKNOW2 = 0X03;
    //END SERVES
    public final static int LXP0 = 0x63;// 	LXP0 	Light X Position 0
    public final static int LYP0 = 0x64;// 	LYP0 	Light Y Position 0
    public final static int LZP0 = 0x65;// 	LZP0 	Light Z Position 0
    public final static int LXP1 = 0x66;// 	LXP1 	Light X Position 1
    public final static int LYP1 = 0x67;// 	LYP1 	Light Y Position 1
    public final static int LZP1 = 0x68;// 	LZP1 	Light Z Position 1
    public final static int LXP2 = 0x69;// 	LXP2 	Light X Position 2
    public final static int LYP2 = 0x6A;// 	LYP2 	Light Y Position 2
    public final static int LZP2 = 0x6B;// 	LZP2 	Light Z Position 2
    public final static int LXP3 = 0x6C;// 	LXP3 	Light X Position 3
    public final static int LYP3 = 0x6D;// 	LYP3 	Light Y Position 3
    public final static int LZP3 = 0x6E;// 	LZP3 	Light Z Position 3
    public final static int LXD0 = 0x6F;// 	LXD0 	Light X Direction 0
    public final static int LYD0 = 0x70;// 	LYD0 	Light Y Direction 0
    public final static int LZD0 = 0x71;// 	LZD0 	Light Z Direction 0
    public final static int LXD1 = 0x72;// 	LXD1 	Light X Direction 1
    public final static int LYD1 = 0x73;// 	LYD1 	Light Y Direction 1
    public final static int LZD1 = 0x74;// 	LZD1 	Light Z Direction 1
    public final static int LXD2 = 0x75;// 	LXD2 	Light X Direction 2
    public final static int LYD2 = 0x76;// 	LYD2 	Light Y Direction 2
    public final static int LZD2 = 0x77;// 	LZD2 	Light Z Direction 2
    public final static int LXD3 = 0x78;// 	LXD3 	Light X Direction 3
    public final static int LYD3 = 0x79;// 	LYD3 	Light Y Direction 3
    public final static int LZD3 = 0x7A;// 	LZD3 	Light Z Direction 3
    public final static int LCA0 = 0x7B;// 	LCA0 	Light Constant Attenuation 0
    public final static int LLA0 = 0x7C;// 	LLA0 	Light Linear Attenuation 0
    public final static int LQA0 = 0x7D;// 	LQA0 	Light Quadratic Attenuation 0
    public final static int LCA1 = 0x7E;// 	LCA1 	Light Constant Attenuation 1
    public final static int LLA1 = 0x7F;// 	LLA1 	Light Linear Attenuation 1
    public final static int LQA1 = 0x80;// 	LQA1 	Light Quadratic Attenuation 1
    public final static int LCA2 = 0x81;// 	LCA2 	Light Constant Attenuation 2
    public final static int LLA2 = 0x82;// 	LLA2 	Light Linear Attenuation 2
    public final static int LQA2 = 0x83;// 	LQA2 	Light Quadratic Attenuation 2
    public final static int LCA3 = 0x84;// 	LCA3 	Light Constant Attenuation 3
    public final static int LLA3 = 0x85;// 	LLA3 	Light Linear Attenuation 3
    public final static int LQA3 = 0x86;// 	LQA3 	Light Quadratic Attenuation 3
    public final static int SLE0 = 0x87;// 	??? 	Spot light 0 exponent
    public final static int SLE1 = 0x88;// 	??? 	Spot light 1 exponent
    public final static int SLE2 = 0x89;// 	??? 	Spot light 2 exponent
    public final static int SLE3 = 0x8A;// 	??? 	Spot light 3 exponent
    public final static int SLF0 = 0x8B;// 	??? 	Spot light 0 cutoff
    public final static int SLF1 = 0x8C;// 	??? 	Spot light 1 cutoff
    public final static int SLF2 = 0x8D;// 	??? 	Spot light 2 cutoff
    public final static int SLF3 = 0x8E;// 	??? 	Spot light 3 cutoff
    public final static int ALC0 = 0x8F;// 	ALC0 	Ambient Light Color 0
    public final static int DLC0 = 0x90;// 	DLC0 	Diffuse Light Color 0
    public final static int SLC0 = 0x91;// 	SLC0 	Specular Light Color 0
    public final static int ALC1 = 0x92;// 	ALC1 	Ambient Light Color 1
    public final static int DLC1 = 0x93;// 	DLC1 	Diffuse Light Color 1
    public final static int SLC1 = 0x94;// 	SLC1 	Specular Light Color 1
    public final static int ALC2 = 0x95;// 	ALC2 	Ambient Light Color 2
    public final static int DLC2 = 0x96;// 	DLC2 	Diffuse Light Color 2
    public final static int SLC2 = 0x97;// 	SLC2 	Specular Light Color 2
    public final static int ALC3 = 0x98;// 	ALC3 	Ambient Light Color 3
    public final static int DLC3 = 0x99;// 	DLC3 	Diffuse Light Color 3
    public final static int SLC3 = 0x9A;// 	SLC3 	Specular Light Color 3
    public final static int FFACE = 0x9B;// 	FFACE 	Front Face Culling Order
        public final static int FFACE_CULLING_ORDER_CLOCKWISE_VISIBLE = 0X00;
        public final static int FFACE_CULLING_ORDER_COUNTER_CLOCKWISE_VISIBLE = 0X01;
    public final static int FBP = 0x9C;// 	FBP 	Frame Buffer Pointer
    public final static int FBW = 0x9D;// 	FBW 	Frame Buffer Width
    public final static int ZBP = 0x9E;// 	ZBP 	Depth Buffer Pointer
    public final static int ZBW = 0x9F;// 	ZBW 	Depth Buffer Width
    public final static int TBP0 = 0xA0;// 	TBP0 	Texture Buffer Pointer 0
    public final static int TBP1 = 0xA1;// 	TBP1 	Texture Buffer Pointer 1
    public final static int TBP2 = 0xA2;// 	TBP2 	Texture Buffer Pointer 2
    public final static int TBP3 = 0xA3;// 	TBP3 	Texture Buffer Pointer 3
    public final static int TBP4 = 0xA4;// 	TBP4 	Texture Buffer Pointer 4
    public final static int TBP5 = 0xA5;// 	TBP5 	Texture Buffer Pointer 5
    public final static int TBP6 = 0xA6;// 	TBP6 	Texture Buffer Pointer 6
    public final static int TBP7 = 0xA7;// 	TBP7 	Texture Buffer Pointer 7
    public final static int TBW0 = 0xA8;// 	TBW0 	Texture Buffer Width 0
    public final static int TBW1 = 0xA9;// 	TBW1 	Texture Buffer Width 1
    public final static int TBW2 = 0xAA;// 	TBW2 	Texture Buffer Width 2
    public final static int TBW3 = 0xAB;// 	TBW3 	Texture Buffer Width 3
    public final static int TBW4 = 0xAC;// 	TBW4 	Texture Buffer Width 4
    public final static int TBW5 = 0xAD;// 	TBW5 	Texture Buffer Width 5
    public final static int TBW6 = 0xAE;// 	TBW6 	Texture Buffer Width 6
    public final static int TBW7 = 0xAF;// 	TBW7 	Texture Buffer Width 7
    public final static int CBP = 0xB0;// 	CBP 	CLUT Buffer Pointer
    public final static int CBPH = 0xB1;// 	CBPH 	CLUT Buffer Pointer H
    public final static int TRXSBP = 0xB2;// 	TRXSBP 	Transmission Source Buffer Pointer
    public final static int TRXSBW = 0xB3;// 	TRXSBW 	Transmission Source Buffer Width
    public final static int TRXDBP = 0xB4;// 	TRXDBP 	Transmission Destination Buffer Pointer
    public final static int TRXDBW = 0xB5;// 	TRXDBW 	Transmission Destination Buffer Width
    public final static int UNKNOWNCOMMAND_0xB6 = 0XB6;
    public final static int UNKNOWNCOMMAND_0xB7 = 0XB7;
    public final static int TSIZE0 = 0xB8;// 	TSIZE0 	Texture Size Level 0
    public final static int TSIZE1 = 0xB9;// 	TSIZE1 	Texture Size Level 1
    public final static int TSIZE2 = 0xBA;// 	TSIZE2 	Texture Size Level 2
    public final static int TSIZE3 = 0xBB;// 	TSIZE3 	Texture Size Level 3
    public final static int TSIZE4 = 0xBC;// 	TSIZE4 	Texture Size Level 4
    public final static int TSIZE5 = 0xBD;// 	TSIZE5 	Texture Size Level 5
    public final static int TSIZE6 = 0xBE;// 	TSIZE6 	Texture Size Level 6
    public final static int TSIZE7 = 0xBF;// 	TSIZE7 	Texture Size Level 7
    public final static int TMAP = 0xC0;// 	TMAP 	Texture Projection Map Mode + Texture Map Mode
        public final static int TMAP_TEXTURE_PROJECTION_MODE_POSITION = 0X00;
        public final static int TMAP_TEXTURE_PROJECTION_MODE_TEXTURE_COORDINATES = 0X01;
        public final static int TMAP_TEXTURE_PROJECTION_MODE_NORMALIZED_NORMAL = 0X02;
        public final static int TMAP_TEXTURE_PROJECTION_MODE_NORMAL = 0X03;

        public final static int TMAP_TEXTURE_MAP_MODE_TEXTURE_COORDIATES_UV = 0X00;
        public final static int TMAP_TEXTURE_MAP_MODE_TEXTURE_MATRIX = 0X01;
        public final static int TMAP_TEXTURE_MAP_MODE_ENVIRONMENT_MAP = 0X02;
        public final static int TMAP_TEXTURE_MAP_MODE_UNKNOW = 0X03;
    public final static int TEXTURE_ENV_MAP_MATRIX = 0xC1;// 	  	Texture Environment Map Matrix
    public final static int TMODE = 0xC2;// 	TMODE 	Texture Mode
    public final static int TPSM = 0xC3;// 	TPSM 	Texture Pixel Storage Mode
        public final static int TPSM_PIXEL_STORAGE_MODE_16BIT_BGR5650 = 0X00;
        public final static int TPSM_PIXEL_STORAGE_MODE_16BIT_ABGR5551 = 0X01;
        public final static int TPSM_PIXEL_STORAGE_MODE_16BIT_ABGR4444 = 0X02;
        public final static int TPSM_PIXEL_STORAGE_MODE_32BIT_ABGR8888 = 0X03;
        public final static int TPSM_PIXEL_STORAGE_MODE_4BIT_INDEXED = 0X04;
        public final static int TPSM_PIXEL_STORAGE_MODE_8BIT_INDEXED = 0X05;
        public final static int TPSM_PIXEL_STORAGE_MODE_16BIT_INDEXED = 0X06;
        public final static int TPSM_PIXEL_STORAGE_MODE_32BIT_INDEXED = 0X07;
        public final static int TPSM_PIXEL_STORAGE_MODE_DXT1 = 0X08;
        public final static int TPSM_PIXEL_STORAGE_MODE_DXT3 = 0X09;
        public final static int TPSM_PIXEL_STORAGE_MODE_DXT5 = 0X0A;
    public final static int CLOAD = 0xC4;// 	CLOAD 	CLUT Load
    public final static int CMODE = 0xC5;// 	CMODE 	CLUT Mode
        public final static int CMODE_FORMAT_16BIT_BGR5650 = 0X00;
        public final static int CMODE_FORMAT_16BIT_ABGR5551 = 0X01;
        public final static int CMODE_FORMAT_16BIT_ABGR4444 = 0X02;
        public final static int CMODE_FORMAT_32BIT_ABGR8888 = 0X03;
    public final static int TFLT = 0xC6;// 	TFLT 	Texture Filter
        public final static int TFLT_NEAREST = 0X00;
        public final static int TFLT_LINEAR = 0X01;
        public final static int TFLT_UNKNOW1 = 0X02;
        public final static int TFLT_UNKNOW2 = 0X03;
        public final static int TFLT_NEAREST_MIPMAP_NEAREST = 0X04;
        public final static int TFLT_LINEAR_MIPMAP_NEAREST = 0X05;
        public final static int TFLT_NEAREST_MIPMAP_LINEAR = 0X06;
        public final static int TFLT_LINEAR_MIPMAP_LINEAR = 0X07;
    public final static int TWRAP = 0xC7;// 	TWRAP 	Texture Wrapping
        public final static int TWRAP_WRAP_MODE_REPEAT = 0X00;
        public final static int TWRAP_WRAP_MODE_CLAMP = 0X01;
    public final static int TBIAS = 0xC8;// 	TBIAS 	Texture Level Bias (???)
    public final static int TFUNC = 0xC9;// 	TFUNC 	Texture Function
        public final static int TFUNC_FRAGMENT_DOUBLE_ENABLE_COLOR_UNTOUCHED = 0X00;
        public final static int TFUNC_FRAGMENT_DOUBLE_ENABLE_COLOR_DOUBLED = 0X01;

        public final static int TFUNC_FRAGMENT_DOUBLE_TEXTURE_COLOR_ALPHA_IS_IGNORED = 0X00;
        public final static int TFUNC_FRAGMENT_DOUBLE_TEXTURE_COLOR_ALPHA_IS_READ = 0X01;

        public final static int TFUNC_FRAGMENT_DOUBLE_TEXTURE_EFECT_MODULATE = 0X00;
        public final static int TFUNC_FRAGMENT_DOUBLE_TEXTURE_EFECT_DECAL = 0X01;
        public final static int TFUNC_FRAGMENT_DOUBLE_TEXTURE_EFECT_BLEND = 0X02;
        public final static int TFUNC_FRAGMENT_DOUBLE_TEXTURE_EFECT_REPLACE = 0X03;
        public final static int TFUNC_FRAGMENT_DOUBLE_TEXTURE_EFECT_ADD = 0X04;
        public final static int TFUNC_FRAGMENT_DOUBLE_TEXTURE_EFECT_UNKNOW1 = 0X05;
        public final static int TFUNC_FRAGMENT_DOUBLE_TEXTURE_EFECT_UNKNOW2 = 0X06;
        public final static int TFUNC_FRAGMENT_DOUBLE_TEXTURE_EFECT_UNKNOW3 = 0X07;
    public final static int TEC = 0xCA;// 	TEC 	Texture Environment Color
    public final static int TFLUSH = 0xCB;// 	TFLUSH 	Texture Flush
    public final static int TSYNC = 0xCC;// 	TSYNC 	Texture Sync
    public final static int FFAR = 0xCD;// 	FFAR 	Fog Far (???)
    public final static int FDIST = 0xCE;// 	FDIST 	Fog Range
    public final static int FCOL = 0xCF;// 	FCOL 	Fog Color
    public final static int TSLOPE = 0xD0;// 	TSLOPE 	Texture Slope
    public final static int UNKNOWNCOMMAND_0xD1 = 0XD1;
    public final static int PSM = 0xD2;// 	PSM 	Frame Buffer Pixel Storage Mode
        public final static int PSM_16BIT_BGR5650 = 0X00;
        public final static int PSM_16BIT_ABGR5551 = 0X01;
        public final static int PSM_16BIT_ABGR4444 = 0X02;
        public final static int PSM_32BIT_ABGR8888 = 0X03;
    public final static int CLEAR = 0xD3;// 	CLEAR 	Clear Flags
        public final static int CLEAR_UNKNOW1 = 0X00;
        public final static int CLEAR_COLOR_BUFFER = 0X01;
        public final static int CLEAR_STENCIL_OR_ALPHA_BUFFER = 0X02;
        public final static int CLEAR_UNKNOW2 = 0X03;
        public final static int CLEAR_DEPTH_BUFFER = 0X04;
        public final static int CLEAR_UNKNOW3 = 0X05;
        public final static int CLEAR_UNKNOW4 = 0X06;
        public final static int CLEAR_UNKNOW5 = 0X07;
    public final static int SCISSOR1 = 0xD4;// 	SCISSOR1 	Scissor Region Start
    public final static int SCISSOR2 = 0xD5;// 	SCISSOR2 	Scissor Region End
    public final static int NEARZ = 0xD6;// 	NEARZ 	Near Depth Range
    public final static int FARZ = 0xD7;// 	FARZ 	Far Depth Range
    public final static int CTST = 0xD8;// 	CTST 	Color Test Function
        public final static int CTST_COLOR_FUNCTION_NEVER_PASS_PIXEL = 0X00;
        public final static int CTST_COLOR_FUNCTION_ALWAYS_PASS_PIXEL = 0X01;
        public final static int CTST_COLOR_FUNCTION_PASS_PIXEL_IF_COLOR_MATCHES = 0X02;
        public final static int CTST_COLOR_FUNCTION_PASS_PIXEL_IF_COLOR_DIFFERS = 0X03;
    public final static int CREF = 0xD9;// 	CREF 	Color Reference
    public final static int CMSK = 0xDA;// 	CMSK 	Color Mask
    public final static int ATST = 0xDB;// 	ATST 	Alpha Test
        public final static int ATST_NEVER_PASS_PIXEL = 0X00;
        public final static int ATST_ALWAYS_PASS_PIXEL = 0X01;
        public final static int ATST_PASS_PIXEL_IF_MATCHES = 0X02;
        public final static int ATST_PASS_PIXEL_IF_DIFFERS = 0X03;
        public final static int ATST_PASS_PIXEL_IF_LESS = 0X04;
        public final static int ATST_PASS_PIXEL_IF_LESS_OR_EQUAL = 0X05;
        public final static int ATST_PASS_PIXEL_IF_GREATER = 0X06;
        public final static int ATST_PASS_PIXEL_IF_GREATER_OR_EQUAL = 0X07;
    public final static int STST = 0xDC;// 	STST 	Stencil Test
        public final static int STST_FUNCTION_NEVER_PASS_STENCIL_TEST = 0X00;
        public final static int STST_FUNCTION_ALWAYS_PASS_STENCIL_TEST = 0X01;
        public final static int STST_FUNCTION_PASS_TEST_IF_MATCHES = 0X02;
        public final static int STST_FUNCTION_PASS_TEST_IF_DIFFERS = 0X03;
        public final static int STST_FUNCTION_PASS_TEST_IF_LESS = 0X04;
        public final static int STST_FUNCTION_PASS_TEST_IF_LESS_OR_EQUAL = 0X05;
        public final static int STST_FUNCTION_PASS_TEST_IF_GREATER = 0X06;
        public final static int STST_FUNCTION_PASS_TEST_IF_GREATER_OR_EQUAL = 0X07;
    public final static int SOP = 0xDD;// 	SOP 	Stencil Operations
        public final static int SOP_KEEP_STENCIL_VALUE = 0X00;
        public final static int SOP_ZERO_STENCIL_VALUE = 0X01;
        public final static int SOP_REPLACE_STENCIL_VALUE = 0X02;
        public final static int SOP_INVERT_STENCIL_VALUE = 0X03;
        public final static int SOP_INCREMENT_STENCIL_VALUE = 0X04;
        public final static int SOP_DECREMENT_STENCIL_VALUE = 0X05;
    public final static int ZTST = 0xDE;// 	ZTST 	Depth Test Function
        public final static int ZTST_FUNCTION_NEVER_PASS_PIXEL = 0X00;
        public final static int ZTST_FUNCTION_ALWAYS_PASS_PIXEL = 0X01;
        public final static int ZTST_FUNCTION_PASS_PX_WHEN_DEPTH_IS_EQUAL = 0X02;
        public final static int ZTST_FUNCTION_PASS_PX_WHEN_DEPTH_ISNOT_EQUAL = 0X03;
        public final static int ZTST_FUNCTION_PASS_PX_WHEN_DEPTH_IS_LESS = 0X04;
        public final static int ZTST_FUNCTION_PASS_PX_WHEN_DEPTH_IS_LESS_OR_EQUAL = 0X05;
        public final static int ZTST_FUNCTION_PASS_PX_WHEN_DEPTH_IS_GREATER = 0X06;
        public final static int ZTST_FUNCTION_PASS_PX_WHEN_DEPTH_IS_GREATER_OR_EQUAL = 0X07;
    public final static int ALPHA = 0xDF;// 	ALPHA 	Alpha Blend
        public final static int ALPHA_SOURCE_COLOR = 0X00;
        public final static int ALPHA_ONE_MINUS_SOURCE_COLOR = 0X01;
        public final static int ALPHA_SOURCE_ALPHA = 0X02;
        public final static int ALPHA_ONE_MINUS_SOURCE_ALPHA = 0X03;
        public final static int ALPHA_DESTINATION_COLOR = 0X04;
        public final static int ALPHA_ONE_MINUS_DESTINATION_COLOR = 0X05;
        public final static int ALPHA_DESTINATION_ALPHA = 0X06;
        public final static int ALPHA_ONE_MINUS_DESTINATION_ALPHA = 0X07;
        public final static int ALPHA_FIX = 0X08;
        public final static int ALPHA_SOURCE_BLEND_OPERATION_ADD = 0X00;
        public final static int ALPHA_SOURCE_BLEND_OPERATION_SUBTRACT = 0X01;
        public final static int ALPHA_SOURCE_BLEND_OPERATION_REVERSE_SUBTRACT = 0X02;
        public final static int ALPHA_SOURCE_BLEND_OPERATION_MINIMUM_VALUE = 0X03;
        public final static int ALPHA_SOURCE_BLEND_OPERATION_MAXIMUM_VALUE = 0X04;
        public final static int ALPHA_SOURCE_BLEND_OPERATION_ABSOLUTE_VALUE = 0X05;
    public final static int SFIX = 0xE0;// 	SFIX 	Source Fix Color
    public final static int DFIX = 0xE1;// 	DFIX 	Destination Fix Color
    public final static int DTH0 = 0xE2;// 	DTH0 	Dither Matrix Row 0
    public final static int DTH1 = 0xE3;// 	DTH1 	Dither Matrix Row 1
    public final static int DTH2 = 0xE4;// 	DTH2 	Dither Matrix Row 2
    public final static int DTH3 = 0xE5;// 	DTH3 	Dither Matrix Row 3
    public final static int LOP = 0xE6;// 	LOP 	Logical Operation
        public final static int LOP_CLEAR = 0X00;
        public final static int LOP_AND = 0X01;
        public final static int LOP_REVERSE_AND = 0X02;
        public final static int LOP_COPY = 0X03;
        public final static int LOP_INVERTED_AND = 0X04;
        public final static int LOP_NO_OPERATION = 0X05;
        public final static int LOP_EXLUSIVE_OR = 0X06;
        public final static int LOP_OR = 0x07;
        public final static int LOP_NEGATED_OR = 0X08;
        public final static int LOP_EQUIVALENCE = 0X09;
        public final static int LOP_INVERTED = 0X0A;
        public final static int LOP_REVERSE_OR = 0X0B;
        public final static int LOP_INVERTED_COPY = 0X0C;
        public final static int LOP_INVERTED_OR = 0X0D;
        public final static int LOP_NEGATED_AND = 0X0E;
        public final static int LOP_SET = 0X0F;
    public final static int ZMSK = 0xE7;// 	ZMSK 	Depth Mask
    public final static int PMSKC = 0xE8;// 	PMSKC 	Pixel Mask Color
    public final static int PMSKA = 0xE9;// 	PMSKA 	Pixel Mask Alpha
    public final static int TRXKICK = 0xEA;// 	TRXKICK 	Transmission Kick
        public final static int TRXKICK_16BIT_TEXEL_SIZE = 0X00;
        public final static int TRXKICK_32BIT_TEXEL_SIZE = 0X01;
    public final static int TRXPOS = 0xEB;// 	TRXSPOS 	Transfer Source Position
    public final static int TRXDPOS = 0xEC;// 	TRXDPOS 	Transfer Destination Position
    public final static int UNKNOWNCOMMAND_0xED = 0XED;
    public final static int TRXSIZE = 0xEE;// 	TRXSIZE 	Transfer Size


    public GeCommands() {
        commands = new String[0x100];
        commands[TRXSIZE]="trxsize";
        commands[UNKNOWNCOMMAND_0xED]="unk 0xed";
        commands[TRXDPOS]="trxdpos";
        commands[TRXPOS]="trxpos";
        commands[TRXKICK]="trxkick";
        commands[PMSKA]="pmska";
        commands[PMSKC]="pmskc";
        commands[ZMSK]="zmsk";
        commands[LOP]="lop";
        commands[DTH3]="dth3";
        commands[DTH2]="dth2";
        commands[DTH1]="dth1";
        commands[DTH0]="dth0";
        commands[DFIX]="dfix";
        commands[SFIX]="sfix";
        commands[ALPHA]="alpha";
        commands[ZTST]="ztst";
        commands[SOP]="sop";
        commands[STST]="stst";
        commands[ATST]="atst";
        commands[CMSK]="cmsk";
        commands[CREF]="cref";
        commands[CTST]="ctst";
        commands[FARZ]="farz";
        commands[NEARZ]="nearz";
        commands[SCISSOR2]="scissor2";
        commands[SCISSOR1]="scissor1";
        commands[CLEAR]="clear";
        commands[PSM]="psm";
        commands[UNKNOWNCOMMAND_0xD1]="unk 0xd1";
        commands[TSLOPE]="tslope";
        commands[FCOL]="fcol";
        commands[FDIST]="fdist";
        commands[FFAR]="ffar";
        commands[TSYNC]="tsync";
        commands[TFLUSH]="tflush";
        commands[TEC]="tec";
        commands[TFUNC]="tfunc";
        commands[TBIAS]="tbias";
        commands[TWRAP]="twrap";
        commands[TFLT]="tflt";
        commands[CMODE]="cmode";
        commands[CLOAD]="cload";
        commands[TPSM]="tpsm";
        commands[TMODE]="tmode";
        commands[TEXTURE_ENV_MAP_MATRIX]="temm";
        commands[TMAP]="tmap";
        commands[TSIZE7]="tsize7";
        commands[TSIZE6]="tsize6";
        commands[TSIZE5]="tsize5";
        commands[TSIZE4]="tsize4";
        commands[TSIZE3]="tsize3";
        commands[TSIZE2]="tsize2";
        commands[TSIZE1]="tsize1";
        commands[TSIZE0]="tsize0";
        commands[UNKNOWNCOMMAND_0xB7]="unk 0xB7";
        commands[UNKNOWNCOMMAND_0xB6]="unk 0xB6";
        commands[TRXDBW]="trxdbw";
        commands[TRXDBP]="trxdbp";
        commands[TRXSBW]="trxsbw";
        commands[TRXSBP]="trxsbp";
        commands[CBPH]="cbph";
        commands[CBP]="cbp";
        commands[TBW7]="tbw7";
        commands[TBW6]="tbw6";
        commands[TBW5]="tbw5";
        commands[TBW4]="tbw4";
        commands[TBW3]="tbw3";
        commands[TBW2]="tbw2";
        commands[TBW1]="tbw1";
        commands[TBW0]="tbw0";
        commands[TBP7]="tbp7";
        commands[TBP6]="tbp6";
        commands[TBP5]="tbp5";
        commands[TBP4]="tbp4";
        commands[TBP3]="tbp3";
        commands[TBP2]="tbp2";
        commands[TBP1]="tbp1";
        commands[TBP0]="tbp0";
        commands[ZBW]="zbw";
        commands[ZBP]="zbp";
        commands[FBW]="fbw";
        commands[FBP]="fbp";
        commands[FFACE]="fface";
        commands[SLC3]="slc3";
        commands[SLC2]="slc2";
        commands[SLC1]="slc1";
        commands[SLC0]="slc0";
        commands[DLC3]="dlc3";
        commands[DLC2]="dlc2";
        commands[DLC1]="dlc1";
        commands[DLC0]="dlc0";
        commands[ALC3]="alc3";
        commands[ALC2]="alc2";
        commands[ALC1]="alc1";
        commands[ALC0]="alc0";
        commands[SLF3]="slf3";
        commands[SLF2]="slf2";
        commands[SLF1]="slf1";
        commands[SLF0]="slf0";
        commands[SLE3]="sel3";
        commands[SLE2]="sel2";
        commands[SLE1]="sel1";
        commands[SLE0]="sel0";
        commands[LQA3]="lqa3";
        commands[LLA3]="lla3";
        commands[LCA3]="lca3";
        commands[LQA2]="lqa2";
        commands[LLA2]="lla2";
        commands[LCA2]="lca2";
        commands[LQA1]="lqa1";
        commands[LLA1]="lla1";
        commands[LCA1]="lca1";
        commands[LQA0]="lqa0";
        commands[LLA0]="lla0";
        commands[LCA0]="lca0";
        commands[LYD3]="lyd3";
        commands[LYD2]="lyd2";
        commands[LYD1]="lyd1";
        commands[LYD0]="lyd0";
        commands[LXD3]="lxd3";
        commands[LXD2]="lxd2";
        commands[LXD1]="lxd1";
        commands[LXD0]="lxd0";
        commands[LZD3]="lzd3";
        commands[LZD2]="lzd2";
        commands[LZD1]="lzd1";
        commands[LZD0]="lzd0";
        commands[LZP3]="lzp3";
        commands[LZP2]="lzp2";
        commands[LZP1]="lzp1";
        commands[LZP0]="lzp0";
        commands[LYP3]="lyp3";
        commands[LYP2]="lyp2";
        commands[LYP1]="lyp1";
        commands[LYP0]="lyp0";
        commands[LXP3]="lxp3";
        commands[LXP2]="lxp2";
        commands[LXP1]="lxp1";
        commands[LXP0]="lxp0";
        commands[LT3]="lt3";
        commands[LT2]="lt2";
        commands[LT1]="lt1";
        commands[LT0]="lt0";
        commands[LMODE]="lmode";
        commands[ALA]="ala";
        commands[ALC]="alc";
        commands[SPOW]="spow";
        commands[UNKNOWNCOMMAND_0x5A]="unk 0x5A";
        commands[UNKNOWNCOMMAND_0x59]="unk 0x59";
        commands[AMA]="ama";
        commands[SMC]="smc";
        commands[DMC]="dmc";
        commands[AMC]="amc";
        commands[EMC]="emc";
        commands[CMAT]="cmat";
        commands[RNORM]="rnorm";
        commands[SHADE]="shade";
        commands[UNKNOWNCOMMAND_0x4F]="unk 0x4f";
        commands[UNKNOWNCOMMAND_0x4E]="unk 0x4e";
        commands[OFFSETY]="offsety";
        commands[OFFSETX]="offsetx";
        commands[VOFFSET]="voffset";
        commands[UOFFSET]="uoffset";
        commands[VSCALE]="vscale";
        commands[USCALE]="uscale";
        commands[ZPOS]="zpos";
        commands[YPOS]="ypos";
        commands[XPOS]="xpos";
        commands[ZSCALE]="zscale";
        commands[YSCALE]="yscale";
        commands[XSCALE]="xscale";
        commands[TMATRIX]="tmatrix";
        commands[TMS]="tms";
        commands[PROJ]="proj";
        commands[PMS]="pms";
        commands[VIEW]="view";
        commands[VMS]="vms";
        commands[MODEL]="model";
        commands[MMS]="mms";
        commands[UNKNOWNCOMMAND_0x39]="unk 0x39";
        commands[PFACE]="pface";
        commands[PPRIM]="pprim";
        commands[PSUB]="psub";
        commands[UNKNOWNCOMMAND_0x35]="unk 0x35";
        commands[UNKNOWNCOMMAND_0x34]="unk 0x34";
        commands[MW7]="mw7";
        commands[MW6]="mw6";
        commands[MW5]="mw5";
        commands[MW4]="mw4";
        commands[MW3]="mw3";
        commands[MW2]="mw2";
        commands[MW1]="mw1";
        commands[MW0]="mw0";
        commands[BONE]="bone";
        commands[BOFS]="bofs";
        commands[UNKNOWNCOMMAND_0x29]="unk 0x29";
        commands[LOE]="loe";
        commands[CTE]="cte";
        commands[PCE]="pce";
        commands[AAE]="aae";
        commands[STE]="ste";
        commands[ZTE]="zte";
        commands[ATE]="ate";
        commands[ABE]="abe";
        commands[DTE]="dte";
        commands[FGE]="fge";
        commands[TME]="tme";
        commands[BCE]="bce";
        commands[CPE]="cpe";
        commands[LTE3]="lte3";
        commands[LTE2]="lte2";
        commands[LTE1]="lte1";
        commands[LTE0]="lte0";
        commands[LTE]="lte";
        commands[REGION2]="region2";
        commands[REGION1]="region1";
        commands[ORIGIN_ADDR]= "origin_addr";
        commands[OFFSET_ADDR]= "offset_addr";
        commands[VTYPE]="vtype";
        commands[UNKNOWNCOMMAND_0x11] = "unk 0x11";
        commands[BASE]="base";
        commands[FINISH]="finish";
        commands[SIGNAL]="signal";
        commands[UNKNOWNCOMMAND_0x0D]="unk 0x0D";
        commands[END] = "end";
        commands[RET] = "ret";
        commands[CALL] = "call";
        commands[BJUMP] = "bjump";
        commands[NOP] = "nop";
        commands[VADDR] = "vaddr";
        commands[IADDR] = "iaddr";
        commands[PRIM] = "prim";
        commands[BEZIER] = "bezier";
        commands[SPLINE] = "spline";
        commands[BBOX] = "bbox";
        commands[JUMP] = "jump";

    }

    public String getCommandString(int command) {
        if (command > 0xff){
            return "invalid command 0x" + Integer.toHexString(command);
        }
        return (commands[command] == null) ?  "unk 0x" + Integer.toHexString(command) : commands[command];
    }
}
