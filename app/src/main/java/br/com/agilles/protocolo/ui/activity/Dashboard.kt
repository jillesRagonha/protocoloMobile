package br.com.agilles.protocolo.ui.activity

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v4.content.ContextCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import br.com.agilles.protocolo.R
import kotlinx.android.synthetic.main.activity_dashboard.*
import kotlinx.android.synthetic.main.toolbar.*

class Dashboard : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        configNavDrawer()
        configuraFab()
    }


    fun configuraFab(){
    }



    fun configNavDrawer() {
        var header = navigation_view.getHeaderView(0)
        val toogle = ActionBarDrawerToggle(this, drawer_layout, toolbar, R.string.abrir, R.string.fechar)
        toogle.drawerArrowDrawable.color = ContextCompat.getColor(this, R.color.colorTextIcons)
        drawer_layout.addDrawerListener(toogle)
        toogle.syncState()
    }
}
