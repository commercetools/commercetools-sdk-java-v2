package io.vrap.rmf.base.client;

import javax.annotation.Nullable;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public abstract class ApiMethod<T extends ApiMethod<T>> {
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
    public ApiMethod(final ApiMethod<T> apiMethod){
        this.apiHttpClient = apiMethod.apiHttpClient;
        this.headers = new ApiHttpHeaders(apiMethod.headers);
        this.queryParams =  new ArrayList<>(apiMethod.queryParams);
    }

    public T addHeader(final String key, final String value) {
        ApiMethod<T> c = copy();
        c.headers = c.headers.addHeader(key, value);
        return (T)c;
    }

    public T withoutHeader(final String key) {
        ApiMethod<T> c = copy();
        c.headers = c.headers.withoutHeader(key);
        return (T)c;
    }

    public T withHeader(final String key, final String value) {
        ApiMethod<T> c = copy();
        c.headers = c.headers.withHeader(key, value);
        return (T)c;
    }

    public T withHeaders(final ApiHttpHeaders headers) {
        ApiMethod<T> c = copy();
        c.headers = headers;
        return (T)c;
    }

    public ApiHttpHeaders getHeaders() {
        return this.headers;
    }

    public <V> T addQueryParam(final String key, final V value) {
        ApiMethod<T> c = copy();
        c.queryParams.add(new ParamEntry<>(key, value.toString()));
        return (T)c;
    }

    public <V> T withQueryParam(final String key, final V value) {
        return withoutQueryParam(key).addQueryParam(key, value);
    }

    public T withoutQueryParam(final String key) {
        ApiMethod<T> c = copy();
        c.queryParams = c.queryParams.stream().filter(e -> !e.getKey().equalsIgnoreCase(key)).collect(Collectors.toList());
        return (T)c;
    }

    public <V> T withQueryParams(final List<ParamEntry<String, String>> queryParams) {
        ApiMethod<T> c = copy();
        c.queryParams = queryParams;
        return (T)c;
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
}
