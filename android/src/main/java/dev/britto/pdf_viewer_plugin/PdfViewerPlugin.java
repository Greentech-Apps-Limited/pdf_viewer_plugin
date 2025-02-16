package dev.britto.pdf_viewer_plugin;

import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import androidx.annotation.NonNull;

public class PdfViewerPlugin implements FlutterPlugin {
  private static final String CHANNEL = "pdf_viewer_plugin";

  public PdfViewerPlugin() {}

  @Override
  public void onAttachedToEngine(@NonNull FlutterPluginBinding binding) {
    BinaryMessenger messenger = binding.getBinaryMessenger();
    binding
            .getPlatformViewRegistry()
            .registerViewFactory(
                    CHANNEL,
                    new PdfViewerFactory(messenger, /*containerView=*/ null)
            );
  }

  @Override
  public void onDetachedFromEngine(@NonNull FlutterPluginBinding binding) {
    // Clean up resources if needed
  }
}