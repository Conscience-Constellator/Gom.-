package CC.Encycloped.Abs.Scal.Gom;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Encycloped.Abs.Scal.Gom.LOc$Dr_Rapr.LOc$Dr_Neg;
import static CC.Encycloped.Abs.Scal.Gom.Gom.CalculAt_Dr;

public interface LOc$Dr
{
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	void LOc$Dr(double[] LOc,double[] Dr);
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default double[] LOc$Dr(double[] LOc)
		{
			double[] Dr=new double[3];

			LOc$Dr(LOc,Dr);

			return Dr;
		}

	LOc$Dr
		SphEr=new LOc$Dr()
		{
			@Override
			public void LOc$Dr(double[] LOc,double[] Dr)
			{CalculAt_Dr(LOc,Dr);}

			@Override
			public String toString()
			{return "SphEr";}
		},
		Bubl=new LOc$Dr_Neg(SphEr)
	;
}