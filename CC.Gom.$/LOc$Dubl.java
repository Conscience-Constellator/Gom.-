package CC.Encycloped.Abs.Scal.Gom;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import static CC.Encycloped.Abs.Scal.Gom.Gom.Hyp;

public interface LOc$Dubl
{
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	double LOc$Dubl(double[] LOc);

	LOc$Dubl
		Hyp=new LOc$Dubl()
		{
			@Lin_DclAr @Neds_Ovrid(NEds=Nutrl) @Finishd(Is_Finishd=true)
			public double LOc$Dubl(double[] LOc)
			{return Hyp(LOc);}

			@Override @Neds_Ovrid(NEds=Nutrl) @Finishd(Is_Finishd=true)
			public String toString()
			{return "Hyp";}
		};
}