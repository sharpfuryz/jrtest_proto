package com.sovremenius.jrb2;

import java.io.IOException;
import java.io.InputStream;

import android.os.Bundle;
import android.app.Activity;
import android.content.res.AssetManager;
import android.util.Log;
import android.view.Menu;
import org.jruby.embed.*;

public class MainActivity extends Activity {
	
	private void scriptrunner() throws IOException{
	  ScriptingContainer container = new ScriptingContainer();
	  AssetManager am = getApplicationContext().getAssets();
	  InputStream is = am.open("main.rb");
	  container.runScriptlet(is,"main.rb");
	}
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
			scriptrunner();
		} catch (IOException e) {
			Log.e("FAIL",e.toString());
		}
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
