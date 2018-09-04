package com.barcode.barcodereader;

public interface BarcodeResult {
    void onResult(String result);

    void onFailure(String error);
}
