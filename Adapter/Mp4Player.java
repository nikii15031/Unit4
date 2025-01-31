/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter;

/**
 *
 * @author nikit
 */
public class Mp4Player implements AdvancedMediaPlayer{
  @Override  
  public void playVlc(String fileName){
      
  }
  @Override
  public void playMp4(String fileName){
      System.out.println("playing mp4 file.Name:"+fileName);
  }
}
