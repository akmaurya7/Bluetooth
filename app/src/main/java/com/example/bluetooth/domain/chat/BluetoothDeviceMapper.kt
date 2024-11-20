package com.example.bluetooth.domain.chat

import android.annotation.SuppressLint
import android.bluetooth.BluetoothDevice

//suppress missing permission because i created custom unity function for it
@SuppressLint("MissingPermission")
fun BluetoothDevice.toBluetoothDeviceDomain(): BluetoothDeviceDomain{
    return BluetoothDeviceDomain(
        name = name,
        address = address
    )
}