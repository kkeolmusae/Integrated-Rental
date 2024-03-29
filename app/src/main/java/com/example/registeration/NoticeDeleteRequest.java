package com.example.registeration;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class NoticeDeleteRequest extends StringRequest {
    final static private String URL = "http://kdo6338.cafe24.com/NoticeDelete.php";

    private Map<String,String> parameters;
    public NoticeDeleteRequest(String noticeName, Response.Listener<String> listener)
    {
        super(Request.Method.POST, URL, listener,null);
        parameters=new HashMap<>();
        parameters.put("noticeName", noticeName);
    }
    @Override
    public Map<String,String> getParams(){
        return parameters;
    }
}
