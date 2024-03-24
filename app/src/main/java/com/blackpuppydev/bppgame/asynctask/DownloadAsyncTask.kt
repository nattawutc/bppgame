package com.blackpuppydev.bppgame.asynctask

import android.os.AsyncTask

class DownloadAsyncTask : AsyncTask<String, Integer, Long>() {


    override fun doInBackground(vararg p0: String?): Long? {
        return 0




    }


    override fun onPostExecute(result: Long?) {
        super.onPostExecute(result)
    }


    override fun onProgressUpdate(vararg values: Integer?) {
        super.onProgressUpdate(*values)
    }


}