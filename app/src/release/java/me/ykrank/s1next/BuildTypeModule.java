package me.ykrank.s1next;

import android.content.Context;

import com.google.common.base.Preconditions;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;

/**
 * Provides instances of the objects according to build type when we need to inject.
 */
@Module
public final class BuildTypeModule {

    public BuildTypeModule(Context context) {

    }

    @Provides
    @Singleton
    OkHttpClient providerOkHttpClient(OkHttpClient.Builder builder) {
        Preconditions.checkState("release".equals(BuildConfig.BUILD_TYPE));

        return builder.build();
    }
}