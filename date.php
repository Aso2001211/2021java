<?php require '../header.php'; ?>
<?php
date_default_timezone_set('Japan');
echo '<p>',date('Y/m/d H:i:s'),'</p>';
echo '<p>',date('Y年m月d日 H時i分s秒'),'</p>';

echo '<h2>',date('Y/m/d'),'</h2>';
echo '<h2>',date('Y-m-d H:i:s'),'</h2>';
echo '<h2>',date('Y年m月d日');

$w=date('w');
$week = ['日','月','火','水','木','金','土'];
echo '<h2>',date('Y/m/d'),$week[$w],'</h2>';
?>
<?php require '../footer.php';?>
