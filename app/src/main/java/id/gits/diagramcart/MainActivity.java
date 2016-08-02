package id.gits.diagramcart;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.LegendRenderer;
import com.jjoe64.graphview.helper.StaticLabelsFormatter;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        GraphView graph = (GraphView) findViewById(R.id.graph);
//        LegendRenderer legendRenderer = new LegendRenderer();
//        graph.setLegendRenderer();
        LineGraphSeries<DataPoint> series = new LineGraphSeries<>(new DataPoint[] {
                new DataPoint(0, 44.2),
                new DataPoint(1, 48.9),
                new DataPoint(2, 52.4),
                new DataPoint(3, 55.3),
                new DataPoint(4, 57.6),
                new DataPoint(5, 59.6),
                new DataPoint(6, 61.2),
                new DataPoint(7, 62.7),
                new DataPoint(8, 64.0),
                new DataPoint(9, 65.2),
                new DataPoint(10, 66.4),
                new DataPoint(11, 67.6),
                new DataPoint(12, 68.6),
                new DataPoint(13, 69.6),
                new DataPoint(14, 70.6),
                new DataPoint(15, 71.6),
                new DataPoint(16, 72.5),
                new DataPoint(17, 73.3),
                new DataPoint(18, 74.2),
                new DataPoint(19, 75.0),
                new DataPoint(20, 75.8),
                new DataPoint(21, 76.5),
                new DataPoint(22, 77.2),
                new DataPoint(23, 78.0),
                new DataPoint(24, 78.7)
        });

        LineGraphSeries<DataPoint> series2 = new LineGraphSeries<>(new DataPoint[] {
                new DataPoint(0, 46.1),
                new DataPoint(1, 50.8),
                new DataPoint(2, 54.4),
                new DataPoint(3, 57.3),
                new DataPoint(4, 59.7),
                new DataPoint(5, 61.7),
                new DataPoint(6, 63.3),
                new DataPoint(7, 64.8),
                new DataPoint(8, 66.2),
                new DataPoint(9, 67.5),
                new DataPoint(10, 68.7),
                new DataPoint(11, 69.9),
                new DataPoint(12, 71.0),
                new DataPoint(13, 72.1),
                new DataPoint(14, 73.1),
                new DataPoint(15, 74.1),
                new DataPoint(16, 75.0),
                new DataPoint(17, 76),
                new DataPoint(18, 76.9),
                new DataPoint(19, 77.7),
                new DataPoint(20, 78.6),
                new DataPoint(21, 79.4),
                new DataPoint(22, 80.2),
                new DataPoint(23, 81),
                new DataPoint(24, 81.7)
        });

        LineGraphSeries<DataPoint> series1 = new LineGraphSeries<>(new DataPoint[] {
                new DataPoint(0, 48.0),
                new DataPoint(1, 52.8),
                new DataPoint(2, 56.4),
                new DataPoint(3, 59.4),
                new DataPoint(4, 61.8),
                new DataPoint(5, 63.8),
                new DataPoint(6, 65.5),
                new DataPoint(7, 67.0),
                new DataPoint(8, 68.4),
                new DataPoint(9, 69.7),
                new DataPoint(10, 71.0),
                new DataPoint(11, 72.2),
                new DataPoint(12, 73.4),
                new DataPoint(13, 74.5),
                new DataPoint(14, 75.6),
                new DataPoint(15, 76.6),
                new DataPoint(16, 77.6),
                new DataPoint(17, 78.6),
                new DataPoint(18, 79.6),
                new DataPoint(19, 80.5),
                new DataPoint(20, 81.4),
                new DataPoint(21, 82.3),
                new DataPoint(22, 83.1),
                new DataPoint(23, 83.9),
                new DataPoint(24, 84.8)
        });

        LineGraphSeries<DataPoint> median = new LineGraphSeries<>(new DataPoint[] {
                new DataPoint(0, 49.9),
                new DataPoint(1, 54.7),
                new DataPoint(2, 58.4),
                new DataPoint(3, 61.4),
                new DataPoint(4, 63.9),
                new DataPoint(5, 65.9),
                new DataPoint(6, 67.6),
                new DataPoint(7, 69.2),
                new DataPoint(8, 70.6),
                new DataPoint(9, 72.0),
                new DataPoint(10, 73.3),
                new DataPoint(11, 74.5),
                new DataPoint(12, 75.7),
                new DataPoint(13, 76.9),
                new DataPoint(14, 78.0),
                new DataPoint(15, 79.1),
                new DataPoint(16, 80.2),
                new DataPoint(17, 81.2),
                new DataPoint(18, 82.3),
                new DataPoint(19, 83.2),
                new DataPoint(20, 84.2),
                new DataPoint(21, 85.1),
                new DataPoint(22, 86.0),
                new DataPoint(23, 86.9),
                new DataPoint(24, 87.8)
        });

        LineGraphSeries<DataPoint> series1A = new LineGraphSeries<>(new DataPoint[] {
                new DataPoint(0, 51.8),
                new DataPoint(1, 56.7),
                new DataPoint(2, 60.4),
                new DataPoint(3, 63.5),
                new DataPoint(4, 66.0),
                new DataPoint(5, 68.0),
                new DataPoint(6, 69.8),
                new DataPoint(7, 71.3),
                new DataPoint(8, 72.8),
                new DataPoint(9, 74.2),
                new DataPoint(10, 75.6),
                new DataPoint(11, 76.9),
                new DataPoint(12, 78.1),
                new DataPoint(13, 79.3),
                new DataPoint(14, 80.5),
                new DataPoint(15, 81.7),
                new DataPoint(16, 82.8),
                new DataPoint(17, 83.9),
                new DataPoint(18, 85.0),
                new DataPoint(19, 86.0),
                new DataPoint(20, 87.0),
                new DataPoint(21, 88.0),
                new DataPoint(22, 89.0),
                new DataPoint(23, 89.9),
                new DataPoint(24, 90.9)
        });

        LineGraphSeries<DataPoint> series2A = new LineGraphSeries<>(new DataPoint[] {
                new DataPoint(0, 53.7),
                new DataPoint(1, 58.6),
                new DataPoint(2, 62.4),
                new DataPoint(3, 65.5),
                new DataPoint(4, 68.0),
                new DataPoint(5, 70.1),
                new DataPoint(6, 71.9),
                new DataPoint(7, 73.5),
                new DataPoint(8, 75.0),
                new DataPoint(9, 76.5),
                new DataPoint(10, 77.9),
                new DataPoint(11, 79.2),
                new DataPoint(12, 80.5),
                new DataPoint(13, 81.8),
                new DataPoint(14, 83.0),
                new DataPoint(15, 84.2),
                new DataPoint(16, 85.4),
                new DataPoint(17, 86.5),
                new DataPoint(18, 87.7),
                new DataPoint(19, 88.8),
                new DataPoint(20, 89.8),
                new DataPoint(21, 90.9),
                new DataPoint(22, 91.9),
                new DataPoint(23, 92.9),
                new DataPoint(24, 93.9)
        });

        LineGraphSeries<DataPoint> series3A = new LineGraphSeries<>(new DataPoint[] {
                new DataPoint(0, 55.6),
                new DataPoint(1, 60.6),
                new DataPoint(2, 64.4),
                new DataPoint(3, 67.6),
                new DataPoint(4, 70.1),
                new DataPoint(5, 72.2),
                new DataPoint(6, 74.0),
                new DataPoint(7, 75.7),
                new DataPoint(8, 77.2),
                new DataPoint(9, 78.7),
                new DataPoint(10, 80.1),
                new DataPoint(11, 81.5),
                new DataPoint(12, 82.9),
                new DataPoint(13, 84.2),
                new DataPoint(14, 85.5),
                new DataPoint(15, 86.7),
                new DataPoint(16, 88.0),
                new DataPoint(17, 89.2),
                new DataPoint(18, 90.4),
                new DataPoint(19, 91.5),
                new DataPoint(20, 92.6),
                new DataPoint(21, 93.8),
                new DataPoint(22, 94.9),
                new DataPoint(23, 95.9),
                new DataPoint(24, 97.0)
        });

        series.setColor(Color.GREEN);
        series.setTitle("-3");
        series2.setColor(Color.RED);
        series2.setTitle("-2");
        series1.setColor(Color.BLUE);
        series1.setTitle("-1");
        median.setColor(Color.DKGRAY);
        series.setTitle("0");
        series1A.setColor(Color.YELLOW);
        series1A.setTitle("1");
        series2A.setColor(Color.MAGENTA);
        series2A.setTitle("2");
        series3A.setColor(Color.CYAN);
        series3A.setTitle("3");


        graph.addSeries(series);
        graph.addSeries(series2);
        graph.addSeries(series1);
        graph.addSeries(median);
        graph.addSeries(series1A);
        graph.addSeries(series2A);
        graph.addSeries(series3A);

        LineGraphSeries<DataPoint> umr = umur();
        umr.setThickness(20);
        umr.setDrawDataPoints(true);
        series.setDataPointsRadius(10);
        umr.setColor(Color.MAGENTA);
        graph.addSeries(umr);



        StaticLabelsFormatter staticLabelsFormatter = new StaticLabelsFormatter(graph);
        staticLabelsFormatter.setHorizontalLabels(new String[] {0+"", 2+"", 4+"", 6+"", 8+"", 10+"", 12+"", 14+"", 16+"", 18+"", 20+"", 22+"", 24+""});
        staticLabelsFormatter.setVerticalLabels(new String[] {0+"", 50+"", 60+"", 70+"", 80+"", 90+"", 100+""});
        graph.getGridLabelRenderer().setLabelFormatter(staticLabelsFormatter);
    }


    public LineGraphSeries<DataPoint> umur(){
        LineGraphSeries<DataPoint> umur = new LineGraphSeries<>(new DataPoint[] {
                new DataPoint(7, 100),
        });
        return umur;
    }
}
