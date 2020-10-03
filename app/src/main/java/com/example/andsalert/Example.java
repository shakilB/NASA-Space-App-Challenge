package com.example.andsalert;

package com.example.andsalert.Retrofit;
import com.example.andsalert.Main;
import com.google.gson.annotations.SerializedName;

public class Example {

    @SerializedName("main")
    private Main main;


    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }
}
