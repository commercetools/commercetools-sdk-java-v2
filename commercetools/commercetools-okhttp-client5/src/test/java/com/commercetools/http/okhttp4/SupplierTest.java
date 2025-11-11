
package com.commercetools.http.okhttp5;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.zip.GZIPOutputStream;

import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.HttpClientSupplier;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import okhttp3.*;
import okio.Okio;

public class SupplierTest {
    @Test
    public void testCreate() {
        Assertions.assertThat(HttpClientSupplier.of().get()).isInstanceOf(CtOkHttp5Client.class);
    }

    @Test
    public void testUnzip() throws IOException {

        ByteArrayOutputStream os = new ByteArrayOutputStream();
        GZIPOutputStream gzipOs = new GZIPOutputStream(os);
        byte[] buffer = "Sample Text".getBytes();
        gzipOs.write(buffer, 0, buffer.length);
        gzipOs.close();
        ByteArrayInputStream inputStream = new ByteArrayInputStream(os.toByteArray());

        CtOkHttp5Client.UnzippingInterceptor interceptor = new CtOkHttp5Client.UnzippingInterceptor();

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

        Response unzipped = interceptor.unzip(gzipped);

        Assertions.assertThat(gzipped.body().source().isOpen()).isTrue();
        Assertions.assertThat(unzipped.body().source().isOpen()).isTrue();
        Assertions.assertThat(inputStream.available()).isEqualTo(31);

        ApiHttpResponse<byte[]> response = CtOkHttp5Client.toResponse(unzipped);

        Assertions.assertThat(gzipped.body().source().isOpen()).isFalse();
        Assertions.assertThat(unzipped.body().source().isOpen()).isFalse();
        Assertions.assertThat(inputStream.available()).isEqualTo(0);

        String text = new String(response.getBody(), StandardCharsets.UTF_8);
        Assertions.assertThat(text).isEqualTo("Sample Text");
    }
}
