package com.quran.labs.androidquran.ui.helpers;

import com.quran.labs.androidquran.widgets.AyahToolBar;

import java.util.Set;

public interface AyahTracker {
  public void highlightAyah(int sura, int ayah, HighlightType type);
  public void highlightAyah(int sura, int ayah, HighlightType type, boolean scrollToAyah);
  public void highlightAyat(
      int page, Set<String> ayahKeys, HighlightType type);
  public void unHighlightAyah(int sura, int ayah, HighlightType type);
  public void unHighlightAyahs(HighlightType type);
  public AyahToolBar.AyahToolBarPosition getToolBarPosition(int sura, int ayah,
      int toolBarWidth, int toolBarHeight);
}