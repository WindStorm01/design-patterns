package com.rh.adapter.adapter;

import com.rh.adapter.inteface.Encrypion;

public class EncryptionAdapter implements Encrypion {

    private ThirdPartyEncryptionAdaptee thirdPartyEncryptionAdaptee;

    public EncryptionAdapter(ThirdPartyEncryptionAdaptee thirdPartyEncryptionAdaptee){
        this.thirdPartyEncryptionAdaptee = thirdPartyEncryptionAdaptee;
    }

    @Override
    public String encrypt(String data) {
        return  thirdPartyEncryptionAdaptee.encryption(data);
    }
}
