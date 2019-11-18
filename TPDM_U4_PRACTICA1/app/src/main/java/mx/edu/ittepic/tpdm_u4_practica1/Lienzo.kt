package mx.edu.ittepic.tpdm_u4_practica1

import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Color
import android.view.View
import android.graphics.Paint
class Lienzo(p:MainActivity):View(p){
        override fun onDraw(c: Canvas) {
                super.onDraw(c)
                val p=Paint()
            val imagen = BitmapFactory.decodeResource(resources,R.drawable.copo)
            val imagen2 = BitmapFactory.decodeResource(resources,R.drawable.luna)
            val imagen3 = BitmapFactory.decodeResource(resources,R.drawable.munecochido)
            val imagen4 = BitmapFactory.decodeResource(resources,R.drawable.cabina)
            val imagen5 = BitmapFactory.decodeResource(resources,R.drawable.arbol)


            setBackgroundColor(Color.BLUE)
                p.color = Color.rgb(255,255,255)
                c.drawCircle(100f, 1900f, 1500f, p)
                c.drawCircle(2100f, 1950f, 1350f, p)
            //Luna
            c.drawBitmap(imagen2,1700f,60f,p)
            //Copos de nieve
            c.drawBitmap(imagen,50f,30f,p) 
            c.drawBitmap(imagen,250f,30f,p) 
            c.drawBitmap(imagen,450f,30f,p) 
            c.drawBitmap(imagen,650f,30f,p) 
            c.drawBitmap(imagen,850f,30f,p) 
            c.drawBitmap(imagen,1050f,30f,p) 
            c.drawBitmap(imagen,1250f,30f,p) 
            c.drawBitmap(imagen,1450f,30f,p) 
            c.drawBitmap(imagen,50f,150f,p) 
            c.drawBitmap(imagen,250f,150f,p) 
            c.drawBitmap(imagen,450f,150f,p) 
            c.drawBitmap(imagen,650f,150f,p) 
            c.drawBitmap(imagen,850f,150f,p) 
            c.drawBitmap(imagen,1050f,150f,p) 
            c.drawBitmap(imagen,1250f,150f,p) 
            c.drawBitmap(imagen,1450f,150f,p)
            c.drawBitmap(imagen,50f,270f,p) 
            c.drawBitmap(imagen,250f,270f,p) 
            c.drawBitmap(imagen,450f,270f,p) 
            c.drawBitmap(imagen,650f,270f,p) 
            c.drawBitmap(imagen,850f,270f,p) 
            c.drawBitmap(imagen,1050f,270f,p) 
            c.drawBitmap(imagen,1250f,270f,p) 
            c.drawBitmap(imagen,1450f,270f,p)
            c.drawBitmap(imagen,650f,390f,p) 
            c.drawBitmap(imagen,850f,390f,p) 
            c.drawBitmap(imagen,1050f,390f,p) 
            c.drawBitmap(imagen,1250f,390f,p) 
            c.drawBitmap(imagen,1450f,390f,p)
            c.drawBitmap(imagen,1650f,390f,p) 
            c.drawBitmap(imagen,1850f,390f,p) 
            c.drawBitmap(imagen,2050f,390f,p) 
            c.drawBitmap(imagen,850f,510f,p) 
            c.drawBitmap(imagen,1050f,510f,p) 
            c.drawBitmap(imagen,1250f,510f,p) 
            c.drawBitmap(imagen,1450f,510f,p)
            c.drawBitmap(imagen,1650f,510f,p) 
            c.drawBitmap(imagen,1850f,510f,p) 
            c.drawBitmap(imagen,2050f,510f,p) 
            c.drawBitmap(imagen,1050f,620f,p) 
            c.drawBitmap(imagen,1250f,620f,p) 
            c.drawBitmap(imagen,1450f,620f,p)
            c.drawBitmap(imagen,1250f,740f,p) 
            //Muñeco de nieve
            c.drawBitmap(imagen3,30f,510f,p)
            //Casa
            c.drawBitmap(imagen4,500f,270f,p)
            //Arboles
            c.drawBitmap(imagen5,50f,100f,p)
            c.drawBitmap(imagen5,1650f,420f,p)
            c.drawBitmap(imagen5,1250f,490f,p)



        }
}
