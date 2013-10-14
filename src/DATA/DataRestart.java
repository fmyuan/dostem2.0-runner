package DATA;

public class DataRestart {

	public int chtid;
	
    // atm
	public int dsr;
	public double firea2sorgn;

	//vegegetation
	public int numpft;
	public int ysf;

	public int ifwoody;                  // - 'veg_dim'
	public int ifdeciwoody;
	public int ifperenial;
	public int ifvascular;
	public int vegage;
	public double vegcov;
	public double lai;
	public double rootfrac[] = new double [ConstLayer.MAX_ROT_LAY];

	public double vegwater;             //canopy water - 'vegs_env'
	public double vegsnow;              //canopy snow  - 'vegs_env'

	public double vegc[] = new double [ConstCohort.NUM_PFT_PART];   // - 'vegs_bgc'
	public double labn;
	public double strn[] = new double [ConstCohort.NUM_PFT_PART];
	public double deadc;
	public double deadn;
	public double unnormleaf;

    public double toptA[] = new double [10];           // this is for f(temp) in GPP to calculate the mean of the 10 previous values

    public double eetmxA[] = new double [10];           // this is for f(phenology) in GPP to calculate the mean of the 10 previous values
    public double petmxA[] = new double [10];
    public double unnormleafmxA[] = new double [10];

    public double prvfoliagemxA;        // this is for f(foliage) in GPP to be sure f(foliage) not going down

    //snow
    public int numsnwl;
    public double snwextramass;
    public double TSsnow[] = new double [ConstLayer.MAX_SNW_LAY];
    public double DZsnow[] = new double [ConstLayer.MAX_SNW_LAY]; 
    public double LIQsnow[] = new double [ConstLayer.MAX_SNW_LAY];
    public double RHOsnow[] = new double [ConstLayer.MAX_SNW_LAY]; 
    public double ICEsnow[] = new double [ConstLayer.MAX_SNW_LAY]; 
    public double AGEsnow[] = new double [ConstLayer.MAX_SNW_LAY];

    //ground-soil
    public int numsl;
    public double ald;
    public int permafrost;
    public double watertab;

    public double DZsoil[] = new double [ConstLayer.MAX_SOI_LAY];
    public int TYPEsoil[] = new int [ConstLayer.MAX_SOI_LAY];
    public double TSsoil[] = new double [ConstLayer.MAX_SOI_LAY]; 
    public double LIQsoil[] = new double [ConstLayer.MAX_SOI_LAY]; 
    public double ICEsoil[] = new double [ConstLayer.MAX_SOI_LAY];
    public int FROZENsoil[] = new int [ConstLayer.MAX_SOI_LAY]; 
    public int TEXTUREsoil[] = new int [ConstLayer.MAX_SOI_LAY];

    public double TSrock[] = new double [ConstLayer.MAX_ROC_LAY]; 
    public double DZrock[] = new double [ConstLayer.MAX_ROC_LAY];

    public double frontZ[] = new double [ConstLayer.MAX_NUM_FNT];
    public int frontFT[] = new int [ConstLayer.MAX_NUM_FNT];
     
    public double wdebrisc;
    public double rawc[] = new double [ConstLayer.MAX_SOI_LAY];
    public double soma[] = new double [ConstLayer.MAX_SOI_LAY];
    public double sompr[] = new double [ConstLayer.MAX_SOI_LAY];
    public double somcr[] = new double [ConstLayer.MAX_SOI_LAY];

    public double wdebrisn;
    public double orgn[] = new double [ConstLayer.MAX_SOI_LAY];
    public double avln[] = new double [ConstLayer.MAX_SOI_LAY];

    public double kdrawc[] = new double [ConstLayer.MAX_SOI_LAY];        //input material C/N (already) adjusted kd
    public double kdsoma[] = new double [ConstLayer.MAX_SOI_LAY];
    public double kdsompr[] = new double [ConstLayer.MAX_SOI_LAY];
    public double kdsomcr[] = new double [ConstLayer.MAX_SOI_LAY];
   	
};

