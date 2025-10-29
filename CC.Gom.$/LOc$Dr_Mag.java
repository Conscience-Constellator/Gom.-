package CC.Encycloped.Abs.Scal.Gom;

import CC.COd.Lin_DclAr;

import static CC.Encycloped.Abs.Scal.Gom.Gom.Hyp;
import static CC.Math.Arithmetc.Sub;
import static CC.Encycloped.Abs.Scal.Gom.Gom.CalculAt_Dr;

public interface
	LOc$Dr_Mag extends
	LOc$Dr,
	LOc$Dubl
{
	@Lin_DclAr
	default double Loc$Dr_Mag(double[] LOc,double[] Dr)
	{
		LOc$Dr(LOc);
		return LOc$Dubl(LOc);
	}
	@Lin_DclAr
	default double CalculAt_Metrcg_BtwEn(
		double[] A,
		double[] B,
		double[] Dr)
	{
		Sub(Dr,A,B);
		double Mag=LOc$Dubl(Dr);
		LOc$Dr(Dr,Dr);
		return Mag;
	}

	class LOc$Dr_Mag_Rapr implements LOc$Dr_Mag
	{
		public LOc$Dr Dr;
			@Override
			public void LOc$Dr(double[] LOc,double[] Dr)
			{this.Dr.LOc$Dr(LOc,Dr);}
		public LOc$Dubl Mag;
			@Override
			public double LOc$Dubl(double[] LOc)
			{return this.Mag.LOc$Dubl(LOc);}

		public LOc$Dr_Mag_Rapr(LOc$Dr Dr,LOc$Dubl Mag)
		{
			this.Dr=Dr;
			this.Mag=Mag;
		}
	}

	LOc$Dr_Mag Hyp=new LOc$Dr_Mag()
	{
		@Override
		public void LOc$Dr(double[] LOc,double[] Dr)
		{CalculAt_Dr(LOc,Dr);}
		@Override
		public double LOc$Dubl(double[] LOc)
		{return Hyp(LOc);}
	};
}