package io.vrap.rmf.base.client;

import javax.annotation.Nullable;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public abstract class ApiMethod<T extends ApiMethod<T, TResult>, TResult> {
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

        public String toUriString()
        {
            try {
                return key + "=" + URLEncoder.encode(value.toString(), StandardCharsets.UTF_8.toString());
            } catch (UnsupportedEncodingException e) {
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

    public ApiMethod(final ApiHttpClient apiHttpClient){
        this.apiHttpClient = apiHttpClient;
    }
    public ApiMethod(final ApiMethod<T, TResult> apiMethod){
        this.apiHttpClient = apiMethod.apiHttpClient;
        this.headers = new ApiHttpHeaders(apiMethod.headers);
        this.queryParams =  new ArrayList<>(apiMethod.queryParams);
    }

    public T addHeader(final String key, final String value) {
        T c = copy();
        ((ApiMethod<T, TResult>)c).headers = ((ApiMethod<T, TResult>)c).headers.addHeader(key, value);
        return c;
    }

    public T withoutHeader(final String key) {
        T c = copy();
        ((ApiMethod<T, TResult>)c).headers = ((ApiMethod<T, TResult>)c).headers.withoutHeader(key);
        return c;
    }

    public T withHeader(final String key, final String value) {
        T c = copy();
        ((ApiMethod<T, TResult>)c).headers = ((ApiMethod<T, TResult>)c).headers.withHeader(key, value);
        return c;
    }

    public T withHeaders(final ApiHttpHeaders headers) {
        T c = copy();
        ((ApiMethod<T, TResult>)c).headers = ((ApiMethod<T, TResult>)c).headers = headers;
        return c;
    }

    public ApiHttpHeaders getHeaders() {
        return this.headers;
    }

    public <V> T addQueryParam(final String key, final V value) {
        T c = copy();
        ((ApiMethod<T, TResult>)c).queryParams.add(new ParamEntry<>(key, value.toString()));
        return c;
    }

    public <V> T withQueryParam(final String key, final V value) {
        return withoutQueryParam(key).addQueryParam(key, value);
    }

    public T withoutQueryParam(final String key) {
        T c = copy();
        ((ApiMethod<T, TResult>)c).queryParams = ((ApiMethod<T, TResult>)c).queryParams.stream().filter(e -> !e.getKey().equalsIgnoreCase(key)).collect(Collectors.toList());
        return c;
    }

    public <V> T withQueryParams(final List<ParamEntry<String, String>> queryParams) {
        T c = copy();
        ((ApiMethod<T, TResult>)c).queryParams = queryParams;
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

    @Nullable
    public String getFirstQueryParam(final String key){
        return this.queryParams.stream().filter(e -> e.getKey().equals(key)).map(Map.Entry::getValue).findFirst().orElse(null);
    }

    protected abstract T copy();

    public abstract ApiHttpRequest createHttpRequest();

    public abstract CompletableFuture<ApiHttpResponse<TResult>> execute();

    public abstract ApiHttpResponse<TResult> executeBlocking();

    public abstract ApiHttpResponse<TResult> executeBlocking(Duration timeout);
}
