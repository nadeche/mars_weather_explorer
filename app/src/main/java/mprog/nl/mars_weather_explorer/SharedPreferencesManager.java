package mprog.nl.mars_weather_explorer;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;

/**
 * Created by Nadeche
 */
public class SharedPreferencesManager {

    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor sharedPreferencesEditor;
    private boolean celsiusUnit;
    private String camera;
    private int latestSol;
    private String imageFilePath;

    private static SharedPreferencesManager preferencesManager = null;

    private SharedPreferencesManager(Context context){
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        sharedPreferencesEditor = sharedPreferences.edit();
        celsiusUnit = sharedPreferences.getBoolean("celsiusUnit", true);
        camera = sharedPreferences.getString("camera", "Front Hazard Avoidance Camera");
        latestSol = sharedPreferences.getInt("latestSol", 1363);
        imageFilePath = sharedPreferences.getString("imageFilePath", "");
    }

    public static SharedPreferencesManager getInstance(Context context){
        if(preferencesManager == null){
            preferencesManager = new SharedPreferencesManager(context);
        }
        return preferencesManager;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
        sharedPreferencesEditor.putString("camera", camera);
        sharedPreferencesEditor.commit();
    }

    public boolean isCelsiusUnit() {
        return celsiusUnit;
    }

    public void setCelsiusUnit(boolean celsiusUnit) {
        this.celsiusUnit = celsiusUnit;
        sharedPreferencesEditor.putBoolean("celsiusUnit", celsiusUnit);
        sharedPreferencesEditor.commit();
    }

    public int getLatestSol() {
        return latestSol;
    }

    public void setLatestSol(int latestSol) {
        this.latestSol = latestSol;
        sharedPreferencesEditor.putInt("latestSol", latestSol);
        sharedPreferencesEditor.commit();
    }

    public String getImageFilePath() {
        return imageFilePath;
    }

    public void setImageFilePath(String imageFilePath) {
        this.imageFilePath = imageFilePath;
        sharedPreferencesEditor.putString("imageFilePath", imageFilePath);
        sharedPreferencesEditor.commit();
    }
}
