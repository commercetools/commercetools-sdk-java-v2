
package io.vrap.rmf.base.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

public abstract class ApiMethod<T extends ApiMethod<T, TResult>, TResult>
        implements RequestCommand<TResult>, ClientRequestCommand<TResult> {
    public static class ParamEntry<K, V> implements Map.Entry<K, V> {
        protected final K key;
        protected V value;

        public ParamEntry(final K key) {
            this.key = key;
        }

        public ParamEntry(final K key, final V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return value;
        }

        @Override
        public V setValue(final V value) {
            V oldValue = this.value;
            this.value = value;
            return oldValue;
        }

        public String toUriString() {
            try {
                return key + "=" + URLEncoder.encode(value.toString(), StandardCharsets.UTF_8.toString());
            }
            catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            return "";
        }
    }

    private ApiHttpHeaders headers = new ApiHttpHeaders();
    private List<ParamEntry<String, String>> queryParams = new ArrayList<>();
    private final ApiHttpClient apiHttpClient;

    protected ApiHttpClient apiHttpClient() {
        return apiHttpClient;
    }

    public ApiMethod(final ApiHttpClient apiHttpClient) {
        this.apiHttpClient = apiHttpClient;
    }

    public ApiMethod(final ApiHttpClient apiHttpClient, ApiHttpHeaders headers,
            List<ParamEntry<String, String>> queryParams) {
        this.apiHttpClient = apiHttpClient;
        this.headers = headers;
        this.queryParams = new ArrayList<>(queryParams);
    }

    public ApiMethod(final ApiMethod<T, TResult> apiMethod) {
        this.apiHttpClient = apiMethod.apiHttpClient;
        this.headers = new ApiHttpHeaders(apiMethod.headers);
        this.queryParams = new ArrayList<>(apiMethod.queryParams);
    }

    /**
     * adds an additional header with the specified value
     * @param key header name
     * @param value header value
     * @return T
     */
    public T addHeader(final String key, final String value) {
        T c = copy();
        ((ApiMethod<T, TResult>) c).headers = ((ApiMethod<T, TResult>) c).headers.addHeader(key, value);
        return c;
    }

    /**
     * removes the specified header
     * @param key header name
     * @return T
     */
    public T withoutHeader(final String key) {
        T c = copy();
        ((ApiMethod<T, TResult>) c).headers = ((ApiMethod<T, TResult>) c).headers.withoutHeader(key);
        return c;
    }

    /**
     * set the header with the specified value
     * @param key header name
     * @param value header value
     * @return T
     */
    public T withHeader(final String key, final String value) {
        T c = copy();
        ((ApiMethod<T, TResult>) c).headers = ((ApiMethod<T, TResult>) c).headers.withHeader(key, value);
        return c;
    }

    /**
     * set the headers
     * @param headers
     * @return
     */
    public T withHeaders(final ApiHttpHeaders headers) {
        T c = copy();
        ((ApiMethod<T, TResult>) c).headers = ((ApiMethod<T, TResult>) c).headers = headers;
        return c;
    }

    /**
     * set specific content type
     * @param contentType
     * @return
     */
    public T contentType(final String contentType) {
        T c = copy();
        ((ApiMethod<T, TResult>) c).headers = ((ApiMethod<T, TResult>) c).headers
                .withHeader(ApiHttpHeaders.CONTENT_TYPE, contentType);

        return c;
    }

    public ApiHttpHeaders getHeaders() {
        return this.headers;
    }

    /**
     * add an additional query parameter
     * @param key query parameter name
     * @param value query parameter value
     * @param <V> value type
     * @return T
     */
    public <V> T addQueryParam(final String key, final V value) {
        T c = copy();
        ((ApiMethod<T, TResult>) c).queryParams.add(new ParamEntry<>(key, value.toString()));
        return c;
    }

    /**
     * set the query parameter with the specified value
     * @param key query parameter name
     * @param value query parameter value
     * @param <V> value type
     * @return T
     */
    public <V> T withQueryParam(final String key, final V value) {
        return withoutQueryParam(key).addQueryParam(key, value);
    }

    /**
     * removes the specified query parameter
     * @param key query parameter name
     * @return T
     */
    public T withoutQueryParam(final String key) {
        T c = copy();
        ((ApiMethod<T, TResult>) c).queryParams = ((ApiMethod<T, TResult>) c).queryParams.stream()
                .filter(e -> !e.getKey().equalsIgnoreCase(key))
                .collect(Collectors.toList());
        return c;
    }

    /**
     * set the query parameters
     * @param queryParams list of query parameters
     * @return T
     */
    public T withQueryParams(final List<ParamEntry<String, String>> queryParams) {
        T c = copy();
        ((ApiMethod<T, TResult>) c).queryParams = queryParams;
        return c;
    }

    public List<ParamEntry<String, String>> getQueryParams() {
        return new ArrayList<>(this.queryParams);
    }

    public List<String> getQueryParam(final String key) {
        return this.queryParams.stream().filter(e -> e.key.equals(key)).map(e -> e.value).collect(Collectors.toList());
    }

    public List<String> getQueryParamUriStrings() {
        return this.queryParams.stream().map(ParamEntry::toUriString).collect(Collectors.toList());
    }

    public String getQueryParamUriString() {
        return this.queryParams.stream().map(ParamEntry::toUriString).collect(Collectors.joining("&"));
    }

    @Nullable
    public String getFirstQueryParam(final String key) {
        return this.queryParams.stream()
                .filter(e -> e.getKey().equals(key))
                .map(Map.Entry::getValue)
                .findFirst()
                .orElse(null);
    }

    protected abstract T copy();

    public abstract ApiHttpRequest createHttpRequest();

    public CompletableFuture<ApiHttpResponse<TResult>> execute() {
        return execute(apiHttpClient());
    }

    public abstract CompletableFuture<ApiHttpResponse<TResult>> execute(ApiHttpClient client);

    public ApiHttpResponse<TResult> executeBlocking() {
        return executeBlocking(apiHttpClient(), Duration.ofSeconds(120));
    };

    public ApiHttpResponse<TResult> executeBlocking(ApiHttpClient client) {
        return executeBlocking(client, Duration.ofSeconds(120));
    };

    public ApiHttpResponse<TResult> executeBlocking(Duration timeout) {
        return executeBlocking(apiHttpClient(), timeout);
    }

    public abstract ApiHttpResponse<TResult> executeBlocking(ApiHttpClient client, Duration timeout);

    public CompletableFuture<ApiHttpResponse<byte[]>> send() {
        return apiHttpClient.execute(createHttpRequest());
    }

    public ApiHttpResponse<byte[]> sendBlocking() {
        return sendBlocking(Duration.ofSeconds(120));
    };

    public ApiHttpResponse<byte[]> sendBlocking(Duration timeout) {
        return blockingWait(send(), timeout);
    }
}
