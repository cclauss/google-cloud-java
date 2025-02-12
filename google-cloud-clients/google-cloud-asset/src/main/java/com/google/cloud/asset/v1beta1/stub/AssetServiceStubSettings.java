/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.asset.v1beta1.stub;

import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GaxProperties;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.GrpcTransportChannel;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.grpc.ProtoOperationTransformers;
import com.google.api.gax.longrunning.OperationSnapshot;
import com.google.api.gax.longrunning.OperationTimedPollAlgorithm;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallSettings;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.cloud.asset.v1beta1.BatchGetAssetsHistoryRequest;
import com.google.cloud.asset.v1beta1.BatchGetAssetsHistoryResponse;
import com.google.cloud.asset.v1beta1.ExportAssetsRequest;
import com.google.cloud.asset.v1beta1.ExportAssetsResponse;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.longrunning.Operation;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link AssetServiceStub}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (cloudasset.googleapis.com) and default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object. For
 * example, to set the total timeout of batchGetAssetsHistory to 30 seconds:
 *
 * <pre>
 * <code>
 * AssetServiceStubSettings.Builder assetServiceSettingsBuilder =
 *     AssetServiceStubSettings.newBuilder();
 * assetServiceSettingsBuilder.batchGetAssetsHistorySettings().getRetrySettings().toBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * AssetServiceStubSettings assetServiceSettings = assetServiceSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class AssetServiceStubSettings extends StubSettings<AssetServiceStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder().add("https://www.googleapis.com/auth/cloud-platform").build();

  private final UnaryCallSettings<ExportAssetsRequest, Operation> exportAssetsSettings;
  private final OperationCallSettings<
          ExportAssetsRequest, ExportAssetsResponse, ExportAssetsRequest>
      exportAssetsOperationSettings;
  private final UnaryCallSettings<BatchGetAssetsHistoryRequest, BatchGetAssetsHistoryResponse>
      batchGetAssetsHistorySettings;

  /** Returns the object with the settings used for calls to exportAssets. */
  public UnaryCallSettings<ExportAssetsRequest, Operation> exportAssetsSettings() {
    return exportAssetsSettings;
  }

  /** Returns the object with the settings used for calls to exportAssets. */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<ExportAssetsRequest, ExportAssetsResponse, ExportAssetsRequest>
      exportAssetsOperationSettings() {
    return exportAssetsOperationSettings;
  }

  /** Returns the object with the settings used for calls to batchGetAssetsHistory. */
  public UnaryCallSettings<BatchGetAssetsHistoryRequest, BatchGetAssetsHistoryResponse>
      batchGetAssetsHistorySettings() {
    return batchGetAssetsHistorySettings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public AssetServiceStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcAssetServiceStub.create(this);
    } else {
      throw new UnsupportedOperationException(
          "Transport not supported: " + getTransportChannelProvider().getTransportName());
    }
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return "cloudasset.googleapis.com:443";
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return DEFAULT_SERVICE_SCOPES;
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return GoogleCredentialsProvider.newBuilder().setScopesToApply(DEFAULT_SERVICE_SCOPES);
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return InstantiatingGrpcChannelProvider.newBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return defaultGrpcTransportProviderBuilder().build();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(AssetServiceStubSettings.class))
        .setTransportToken(
            GaxGrpcProperties.getGrpcTokenName(), GaxGrpcProperties.getGrpcVersion());
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected AssetServiceStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    exportAssetsSettings = settingsBuilder.exportAssetsSettings().build();
    exportAssetsOperationSettings = settingsBuilder.exportAssetsOperationSettings().build();
    batchGetAssetsHistorySettings = settingsBuilder.batchGetAssetsHistorySettings().build();
  }

  /** Builder for AssetServiceStubSettings. */
  public static class Builder extends StubSettings.Builder<AssetServiceStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;

    private final UnaryCallSettings.Builder<ExportAssetsRequest, Operation> exportAssetsSettings;
    private final OperationCallSettings.Builder<
            ExportAssetsRequest, ExportAssetsResponse, ExportAssetsRequest>
        exportAssetsOperationSettings;
    private final UnaryCallSettings.Builder<
            BatchGetAssetsHistoryRequest, BatchGetAssetsHistoryResponse>
        batchGetAssetsHistorySettings;

    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put(
          "idempotent",
          ImmutableSet.copyOf(
              Lists.<StatusCode.Code>newArrayList(
                  StatusCode.Code.DEADLINE_EXCEEDED, StatusCode.Code.UNAVAILABLE)));
      definitions.put("non_idempotent", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings =
          RetrySettings.newBuilder()
              .setInitialRetryDelay(Duration.ofMillis(100L))
              .setRetryDelayMultiplier(1.3)
              .setMaxRetryDelay(Duration.ofMillis(60000L))
              .setInitialRpcTimeout(Duration.ofMillis(20000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(20000L))
              .setTotalTimeout(Duration.ofMillis(600000L))
              .build();
      definitions.put("default", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this((ClientContext) null);
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      exportAssetsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      exportAssetsOperationSettings = OperationCallSettings.newBuilder();

      batchGetAssetsHistorySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              exportAssetsSettings, batchGetAssetsHistorySettings);

      initDefaults(this);
    }

    private static Builder createDefault() {
      Builder builder = new Builder((ClientContext) null);
      builder.setTransportChannelProvider(defaultTransportChannelProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultApiClientHeaderProviderBuilder().build());
      builder.setEndpoint(getDefaultEndpoint());
      return initDefaults(builder);
    }

    private static Builder initDefaults(Builder builder) {

      builder
          .exportAssetsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .batchGetAssetsHistorySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));
      builder
          .exportAssetsOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<ExportAssetsRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(ExportAssetsResponse.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(ExportAssetsRequest.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(5000L))
                      .setInitialRpcTimeout(Duration.ZERO) // ignored
                      .setRpcTimeoutMultiplier(1.0) // ignored
                      .setMaxRpcTimeout(Duration.ZERO) // ignored
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));

      return builder;
    }

    protected Builder(AssetServiceStubSettings settings) {
      super(settings);

      exportAssetsSettings = settings.exportAssetsSettings.toBuilder();
      exportAssetsOperationSettings = settings.exportAssetsOperationSettings.toBuilder();
      batchGetAssetsHistorySettings = settings.batchGetAssetsHistorySettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              exportAssetsSettings, batchGetAssetsHistorySettings);
    }

    // NEXT_MAJOR_VER: remove 'throws Exception'
    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(unaryMethodSettingsBuilders, settingsUpdater);
      return this;
    }

    public ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders() {
      return unaryMethodSettingsBuilders;
    }

    /** Returns the builder for the settings used for calls to exportAssets. */
    public UnaryCallSettings.Builder<ExportAssetsRequest, Operation> exportAssetsSettings() {
      return exportAssetsSettings;
    }

    /** Returns the builder for the settings used for calls to exportAssets. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            ExportAssetsRequest, ExportAssetsResponse, ExportAssetsRequest>
        exportAssetsOperationSettings() {
      return exportAssetsOperationSettings;
    }

    /** Returns the builder for the settings used for calls to batchGetAssetsHistory. */
    public UnaryCallSettings.Builder<BatchGetAssetsHistoryRequest, BatchGetAssetsHistoryResponse>
        batchGetAssetsHistorySettings() {
      return batchGetAssetsHistorySettings;
    }

    @Override
    public AssetServiceStubSettings build() throws IOException {
      return new AssetServiceStubSettings(this);
    }
  }
}
