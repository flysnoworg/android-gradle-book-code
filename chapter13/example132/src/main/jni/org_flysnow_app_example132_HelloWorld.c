//
// Created by flysnow on 16-6-1.
//
#include <android/log.h>
#include "org_flysnow_app_example132_HelloWorld.h"

JNIEXPORT jstring JNICALL Java_org_flysnow_app_example132_HelloWorld_getHelloWorld
  (JNIEnv *env, jobject obj){
    __android_log_print(ANDROID_LOG_INFO,"HelloWorld","测试Android Log日志打印");
  return (*env)->NewStringUTF(env,"你好，《Android Gradle权威指南》的朋友们");
}
