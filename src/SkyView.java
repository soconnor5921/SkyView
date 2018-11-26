public class SkyView
{
    private double[][] view;

    public SkyView(int numRows, int numCols, double[] scanned)
    {
        view = new double[numRows][numCols];
        int index = 0;
        for(int i = 0; i < view.length; i++)
        {
            for(int j = 0; j < view[i].length; j++)
            {
                if(i % 2 == 0)
                {
                    view[i][j] = scanned[index];
                }
                else
                {
                    view[i][numCols - j - 1] = scanned[index];
                }
                index ++;
            }
        }
    }
}
