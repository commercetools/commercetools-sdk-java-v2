
package com.commercetools.http.okhttp5;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.zip.GZIPOutputStream;

import io.vrap.rmf.base.client.ApiHttpResponse;

import org.assertj.core.api.Assertions;
import org.openjdk.jmh.annotations.*;

import okhttp3.*;
import okio.Okio;

public class UnzipBenchmark {

    @State(Scope.Benchmark)
    public static class InterceptorState {
        private CtOkHttp4Client.UnzippingInterceptor interceptor;

        @Setup(Level.Trial)
        public void init() {
            interceptor = new CtOkHttp4Client.UnzippingInterceptor();
            printUsedMemory();

        }

        @TearDown(Level.Trial)
        public void tearDown() {
            printUsedMemory();
        }
    }
    @Benchmark
    public void unzip(InterceptorState state) throws IOException {

        ByteArrayOutputStream os = new ByteArrayOutputStream();
        GZIPOutputStream gzipOs = new GZIPOutputStream(os);
        byte[] buffer = "Sample Text".getBytes();
        gzipOs.write(buffer, 0, buffer.length);
        gzipOs.close();
        ByteArrayInputStream inputStream = new ByteArrayInputStream(os.toByteArray());

        Response gzipped = new Response.Builder().request(new Request.Builder().url("http://localhost").build())
                .protocol(Protocol.HTTP_1_1)
                .addHeader("content-encoding", "gzip")
                .addHeader("content-type", "application/json")
                .code(200)
                .message("Ok")
                .body(ResponseBody.create(MediaType.parse("application/json"), -1L,
                    Okio.buffer(Okio.source(inputStream))))
                .build();
        Assertions.assertThat(gzipped.body().source().isOpen()).isTrue();

        Response unzipped = state.interceptor.unzip(gzipped);

        Assertions.assertThat(gzipped.body().source().isOpen()).isTrue();
        Assertions.assertThat(unzipped.body().source().isOpen()).isTrue();
        Assertions.assertThat(inputStream.available()).isEqualTo(31);

        ApiHttpResponse<byte[]> response = CtOkHttp4Client.toResponse(unzipped);

        Assertions.assertThat(gzipped.body().source().isOpen()).isFalse();
        Assertions.assertThat(unzipped.body().source().isOpen()).isFalse();
        Assertions.assertThat(inputStream.available()).isEqualTo(0);

        String text = new String(response.getBody(), StandardCharsets.UTF_8);
        Assertions.assertThat(text).isEqualTo("Sample Text");
    }

    public static void printUsedMemory() {
        long _usedMem;
        long _total;
        long _total2;
        long _count = -1;
        System.out.flush();
        // loop to get a stable reading, since memory may be resized between the method calls
        do {
            _count++;
            _total = Runtime.getRuntime().totalMemory();
            try {
                Thread.sleep(12);
            }
            catch (Exception ignore) {
            }
            long _free = Runtime.getRuntime().freeMemory();
            _total2 = Runtime.getRuntime().totalMemory();
            _usedMem = _total - _free;
        } while (_total != _total2);
        System.out.println("before GC: used=" + _usedMem + ", loopCount=" + _count + ", total=" + _total);
        try {
            Runtime.getRuntime().gc();
            Thread.sleep(55);
            Runtime.getRuntime().gc();
            Thread.sleep(55);
            Runtime.getRuntime().gc();
            Thread.sleep(55);
            Runtime.getRuntime().gc();
            Thread.sleep(55);
        }
        catch (Exception ignore) {
        }
        // loop to get a stable reading, since memory may be resized between the method calls
        do {
            _count++;
            _total = Runtime.getRuntime().totalMemory();
            try {
                Thread.sleep(12);
            }
            catch (Exception ignore) {
            }
            long _free = Runtime.getRuntime().freeMemory();
            _total2 = Runtime.getRuntime().totalMemory();
            _usedMem = _total - _free;
        } while (_total != _total2);
        System.out.println("after GC: used=" + _usedMem + ", loopCount=" + _count + ", total=" + _total);
    }
}
