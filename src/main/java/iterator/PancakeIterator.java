package iterator;

import java.util.ArrayList;

public class PancakeIterator implements Iterator {

  ArrayList<MenuItem> items;
  int position = 0;

  public PancakeIterator(ArrayList<MenuItem> items) {
    this.items = items;
  }

  @Override
  public boolean hasNext() {
    if (position >= items.size() || items.get(position) == null) {
      return false;
    } else {
      return true;
    }
  }

  @Override
  public Object next() {
    MenuItem menuItem = items.get(position);
    position++;
    return menuItem;
  }
}
