package CC.Encycloped.Abs.Scal.Gom;

import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import static CC.List.BAs_ArA.ABC;
import CC.Encycloped.Abs.Scal.Gom.RL_LOc_Havr;
import static CC.Encycloped.Abs.Scal.Gom.LOc.Gar_LOc;

public interface LOc$LOc
{
	@Lin_DclAr
	void Loc$Loc(double[] Loc,double[] Rsult);
		@Lin_DclAr @Neds_Ovrid(NEds=No)
		default double[] Loc$Loc(double[] Loc)
		{
			double[] Rsult=new double[3];
			Loc$Loc(Loc,Rsult);

			return Rsult;
		}

	@Lin_DclAr
	default void Aply(RL_LOc_Havr TRget,double[] Loc)
	{
		TRget.Get_LOc_CoP_As_ArA(Loc);
		Loc$Loc(Loc,Loc);
		TRget.Set_LOc(Loc);
	}

	static LOc$LOc Rtrnr(double[] Rsult)
	{return (From,To)->{ABC(To,Rsult);};}
	static LOc$LOc Rtrnr(RL_LOc_Havr Rsult)
	{return (From,To)->{Rsult.Get_LOc_CoP_As_ArA(To);};}
	static LOc$LOc Rtrnr(Object Rsult)
	{return Rtrnr(Gar_LOc(Rsult).$ArA());}
}