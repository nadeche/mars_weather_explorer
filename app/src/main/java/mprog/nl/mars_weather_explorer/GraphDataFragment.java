package mprog.nl.mars_weather_explorer;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Nadeche
 */
// TODO Add graphView library and incorporate
// TODO Add to actionbar search date range function

public class GraphDataFragment extends android.support.v4.app.Fragment{

    public static GraphDataFragment newInstance(){
        GraphDataFragment fragment = new GraphDataFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_graph_data, container, false);
        return rootView;
    }
}
