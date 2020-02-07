package com.zay.music.module.mainmodule.found

import androidx.lifecycle.MutableLiveData
import com.zay.music.data.*
import com.zay.music.module.mainmodule.bean.BannerDataBean

open class FoundRepository(val loadState: MutableLiveData<State>) : ApiRepository() {
    fun getBanner(liveData: MutableLiveData<BannerDataBean>) {
        RetrofitManager.instance.api.getBanner(1).execute(BaseObserver(liveData, loadState, this))
    }
}

