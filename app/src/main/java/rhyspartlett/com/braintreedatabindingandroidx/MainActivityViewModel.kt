package rhyspartlett.com.braintreedatabindingandroidx

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData

class MainActivityViewModel(application: Application): AndroidViewModel(application) {
    val email = MutableLiveData<String>()
}