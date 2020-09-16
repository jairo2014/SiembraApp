
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "siembra")
public class Siembra {

    // Variables privadas solo se pueden acceder en el contexto de la clase
    @PrimaryKey(autoGenerate = true)
    private int mCodigoSiembra;

    @ColumnInfo(name = "ubicacion")
    private String mUbicacion;
    @ColumnInfo(name = "variedad")
    private String mVariedad;
    @ColumnInfo(name = "fecha_siembra")
    private Date mFechaSiembra;
    @ColumnInfo(name = "area")
    private float mArea;
    private int mCantidadAbono;
    private int mVariedadAbono;
    private int mCantidadSemilla;
    private int mVariedadSemilla;

    //Getter
    public String getUbicacion(){
        return mUbicacion;
    }
    public int getCantidadAbono(){
        return mCantidadAbono;
    };

    public Date getFechaSiembra(){
        return mFechaSiembra;
    };

    public float getArea(){
        return  mArea;
    };

    //Setter
    public void setUbicacion(String ubicacion){
        this.mUbicacion = ubicacion;
    }

    public void setCantidadAbono(int cantidadAbono){
        this.mCantidadAbono = cantidadAbono;
    };
}
