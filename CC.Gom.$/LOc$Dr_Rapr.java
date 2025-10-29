package CC.Encycloped.Abs.Scal.Gom;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Math.Arithmetc;
import CC.Encycloped.Abs.Scal.Gom.RL_LOc_Havr;
import CC.Encycloped.Abs.Scal.Gom.RL_LOc_Havr.RL_LOc_Havr_ConcrEt;
import static CC.Encycloped.Abs.Org.Syc.TXt.Num.List$String;
import static CC.Encycloped.Abs.Org.Syc.TXt.Num.Dfalt_Mantisa_Lim;

public interface LOc$Dr_Rapr
		 extends LOc$Dr
{
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	LOc$Dr Get_Rapd_LOc$Dr();
		@Override
		default void LOc$Dr(double[] LOc,double[] Dr)
		{Get_Rapd_LOc$Dr().LOc$Dr(LOc,Dr);}

	class LOc$Dr_Rapr_ConcrEt
	implements LOc$Dr_Rapr
	{
		public LOc$Dr Rapd_Loc$Dr;
			@Override
			public LOc$Dr Get_Rapd_LOc$Dr()
			{return Rapd_Loc$Dr;}

		public LOc$Dr_Rapr_ConcrEt(LOc$Dr Rapd)
		{Rapd_Loc$Dr=Rapd;}
	}
	class Trand_LOc$Dr
	extends RL_LOc_Havr_ConcrEt
	implements LOc$Dr_Rapr
	{
		public LOc$Dr Rapd_Loc$Dr;
			@Override
			public LOc$Dr Get_Rapd_LOc$Dr()
			{return Rapd_Loc$Dr;}
			@Override
			public void LOc$Dr(double[] LOc,double[] Dr)
			{LOc$Dr_Rapr.super.LOc$Dr(Arithmetc.Sub(Get_LOc_CoP_As_ArA(),LOc),Dr);}

		@Override
		public String toString()
		{return Get_Rapd_LOc$Dr()+"@"+List$String(Dfalt_Mantisa_Lim,Get_LOc_CoP_As_ArA());}

		public Trand_LOc$Dr(
			RL_LOc_Havr Parnt,Object Loc_Sorc,
			LOc$Dr Rapd)
		{
			super(Parnt,Loc_Sorc);
			Rapd_Loc$Dr=Rapd;
		}
	}
	class LOc$Dr_Neg extends LOc$Dr_Rapr_ConcrEt
	{
		@Override
		public void LOc$Dr(double[] LOc,double[] Dr)
		{
			super.LOc$Dr(LOc,Dr);
			Arithmetc.Invrt_SAm(Dr);
		}

		@Override
		public String toString()
		{return "-"+Get_Rapd_LOc$Dr();}

		public LOc$Dr_Neg(LOc$Dr Rapd)
		{super(Rapd);}
	}
}