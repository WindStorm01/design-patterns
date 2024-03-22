package com.rh.adapter.main;

import com.rh.adapter.adapter.Database;
import com.rh.adapter.adapter.EncryptionAdapter;
import com.rh.adapter.adapter.ThirdPartyEncryptionAdaptee;

public class AdapterMain {
    public static void main(String[] args) {
        ThirdPartyEncryptionAdaptee thirdPartyEncryptionAdaptee = new ThirdPartyEncryptionAdaptee();
        EncryptionAdapter encryptionAdapter = new EncryptionAdapter(thirdPartyEncryptionAdaptee);
        Database database = new Database();
        String encryptionData = encryptionAdapter.encrypt("需加密的数据");
        database.save(encryptionData);
    }
}
